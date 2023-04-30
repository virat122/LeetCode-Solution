//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            N_ary_Tree tree = new N_ary_Tree();
            Node curr = null;
            Queue<Node> q = new LinkedList<>();
            for(int i = 0; i < s.length; i++){
                if(i == 0){
                    curr = tree.add(Integer.parseInt(s[0]), null);
                } else if(s[i].equals(" ")){
                    continue;
                } else if(!q.isEmpty() && s[i].equals("N")){
                    curr = q.remove();
                } else if(!s[i].equals("N")){
                    q.add(tree.add(Integer.parseInt(s[i]), curr));
                }
            }
            Solution soln = new Solution();
            ot.println(soln.duplicateSubtreeNaryTree(tree.root));
        }

        ot.close();
    }
}
class Node{
    int data;
    List<Node> children;
    Node(int val){
        this.data = val;
        this.children = new ArrayList<>();
    }
}
class N_ary_Tree{
    Node root;
    int size;
    N_ary_Tree(){
        this.size = 0;
        this.root = null;
    }
    Node add(int key, Node parent){
        Node node = new Node(key);
        if(parent == null){
            this.root = node;
            this.size = 1;
        } else{
            parent.children.add(node);
            this.size++;
        }
        return node;
    }
}

// } Driver Code Ends


//User function Template for Java




//User function Template for Java


class Solution{
    public int res=0;
    public int duplicateSubtreeNaryTree(Node root){
       // Code here
       Map<String,Integer> map=new HashMap<>();
       duplicateSubtreeNaryTreeRec(root,map);
       return res;
    }
    
    public String duplicateSubtreeNaryTreeRec(Node node,Map<String,Integer> map)
    {
        if(node==null)
            return null;
            
         StringBuilder strBuilder=new StringBuilder(node.data+"");
         
        for(Node child:node.children)
        {
         String childStr=duplicateSubtreeNaryTreeRec(child,map);
         if(childStr!=null)
         {
         strBuilder.append(",");
         strBuilder.append(childStr);
         }
        }
        
        String sub=strBuilder.toString();
        int dup=map.getOrDefault(sub,0);
        
        if(dup==1)
            res=res+1;
            
        map.put(sub,dup+1);
        
        return sub;
    }
}
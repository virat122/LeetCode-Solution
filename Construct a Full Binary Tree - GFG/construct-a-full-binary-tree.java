//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java




//User function Template for Java


class Solution
{
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
         if(size==0) return null;
       HashMap<Integer,Integer> pmap = new HashMap<>();
       HashMap<Integer,Integer> mmap = new HashMap<>();
       for(int i=0;i<size;i++){
           pmap.put(pre[i],i);
       }
       for(int i=0;i<size;i++){
           mmap.put(preM[i],i);
       }
       Queue<Node> queue = new LinkedList<>();
       Node root = new Node(pre[0]);
       queue.add(root);
       int count_no_nodes=1;
       while(count_no_nodes<size){
           int n=queue.size();
           while(n>0 && count_no_nodes!=size){
               Node curr= queue.poll();
               int data = curr.data;
               int pre_ind=pmap.get(data);
               int mir_ind=mmap.get(data);
               Node left = new Node(pre[++pre_ind]);
               Node right = new Node(preM[++mir_ind]);
               curr.left=left;
               curr.right=right;
               queue.add(left);
               queue.add(right);
               n--;
               count_no_nodes+=2;
           }
       }
       return root;
    }
}
//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0){
            String line = br.readLine().trim();
            Node root = buildTree(line);
            
            line = br.readLine().trim();
            String target_k[] = line.split(" ");
            int home = Integer.parseInt(target_k[0]);
            int k = Integer.parseInt(target_k[1]);
            
            Solution x = new Solution();
            System.out.println( x.ladoos(root, home, k) );
            t--;
        }
    }
}


// } Driver Code Ends


/*
// node structure:

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/


class Solution{
    
     static int sum;
    static void add_subtree(Node n, int distination) {
        if ((n == null) || (distination < 0))
            return;
        sum += n.data;
        add_subtree(n.left, distination - 1);
        add_subtree(n.right, distination - 1);
    }
    static int traverse(Node n, int target, int k) {
        if (n == null)
            return -1;
        if (n.data == target) {
            add_subtree(n, k);
            return k - 1;
        }
        int distination = traverse(n.left, target, k);
        if (distination > -1)
        {
            sum += n.data;
            add_subtree(n.right, distination - 1);
            return distination - 1;
        }
        distination = traverse(n.right, target, k);
        if (distination > -1)
        {
            sum += n.data;
            add_subtree(n.left, distination - 1);
            return distination - 1;
        }
        return -1;
    }
    
    static int ladoos(Node root, int home, int k){
        // Your code goes here
        
              sum = 0;
        traverse(root, home, k);
        return sum;
        
        
    }
}


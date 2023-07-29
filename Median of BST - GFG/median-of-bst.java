//{ Driver Code Starts
//Initial Template for Java

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
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Tree g = new Tree();
                float answer = g.findMedian(root);
                if(answer-(int)answer == 0)
        		    System.out.println((int)answer);
        		else
        		    System.out.println(answer);
                t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


//User function Template for Java

class Tree
{
    public static float findMedian(Node root)
    {
        int cnt =  morris(root);
         Node curr = root, preptr = null, prev = null;
        int currcnt=0;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                // if(k==1) return curr;
                // k--;
                //odd
                // Odd case
                  currcnt++;
                if (cnt % 2 != 0 && currcnt == (cnt + 1) / 2)
                    return curr.data;
                    
                    //even case
                 else if (cnt % 2 == 0 && currcnt == (cnt / 2) + 1)
                    return (float) (preptr.data + curr.data) / 2;
                    
                    // Update prev for even no. of nodes
                preptr = curr;
                
                curr=curr.right;
            }
            
           
            else
            {
                //move as right as poss
                 prev = curr.left;
                while(prev.right!=null && prev.right!=curr)
                prev= prev.right;
                
                if(prev.right==null)
                {
                    prev.right=curr; // make thread
                    curr=curr.left; //do the same for remaining lst
                    
                }
                else //prev.right!=null // thread alreadt there
                {
                    prev.right=null;
                    //access the node since inorder
                    // if(k==1) return curr;
                    //  k--; 
                    // cnt++;
                    currcnt++;
                if (cnt % 2 != 0 && currcnt == (cnt + 1) / 2)
                    return curr.data;
                    
                    //even case
                 else if (cnt % 2 == 0 && currcnt == (cnt / 2) + 1)
                    return (float) (preptr.data + curr.data) / 2;
                    
                      preptr = curr;
                      
                    curr= curr.right;
                }
            }
        }
          return -1;
    }
     static int morris(Node curr)
    {
        int cnt=0;
         while(curr!=null)
        {
            if(curr.left==null)
            {
                // if(k==1) return curr;
                // k--;
                cnt++;
                curr=curr.right;
            }
            
           
            else
            {
                //move as right as poss
                 Node prev = curr.left;
                while(prev.right!=null && prev.right!=curr)
                prev= prev.right;
                
                if(prev.right==null)
                {
                    prev.right=curr; // make thread
                    curr=curr.left; //do the same for remaining lst
                    
                }
                else //prev.right!=null // thread alreadt there
                {
                    prev.right=null;
                    //access the node since inorder
                    // if(k==1) return curr;
                    //  k--; 
                    cnt++;
                    curr= curr.right;
                }
            }
        }
        return cnt;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends






/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    // using TreeSet here becoz it will store distinct element in sorted orders
        Set<Integer> set = new TreeSet<>();
        // iterating 1st linkedlist into TreeSet
        while(head1 != null){
            set.add(head1.data);
            head1 = head1.next;
        }
        //  iterating 2nd linkedlist into TreeSet
        while(head2 != null){
            set.add(head2.data);
            head2 = head2.next;
        }
        
        Node ans = null;
        Node temp = null;
        // storing back into new linkedlist from TreeSet
        for(int x : set){
            // for creating 1st node
            if(ans == null){
                ans = new Node(x);
                temp = ans;
            }
            // for other nodes
            else{
                temp.next = new Node(x);
                temp = temp.next;
            }
        }
	   return ans;
	}
}
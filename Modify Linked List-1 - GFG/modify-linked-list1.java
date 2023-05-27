//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution
{
    public static Node modifyTheList(Node head)
    {
    //     Node temp=head;
    //     Node fast=head;
    //     Node slow=head;
    //     Node prev=null;
        
    //     while(fast!=null){
    //         fast=fast.next.next;
    //         slow.next=prev;
    //         slow=slow.next;
    //         prev=temp;
    //         temp=temp.next;
    //     }
       
    //   Node first=head; 
    //     while(prev!=slow || first!=slow){
    //         first.data=prev.data-first.data;
    //         first=first.next;
    //         prev=prev.next;
    //     }
        // return first;
        if(head==null || head.next==null)
        return head;
        
        ArrayList<Integer> li=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            li.add(curr.data);
            curr=curr.next;
        }
        int r=0;
        int [] arr = li.stream().mapToInt(i -> i).toArray();
        int len=arr.length;
        for(int i=0;i<len/2;i++)
        {
            int temp=arr[len-i-1]-arr[i];
            arr[len-i-1]=arr[i];
            arr[i]=temp;
        }
        Node node=head;
        while(node!=null){
            node.data=arr[r++];
            node=node.next;
        }
        return head;
    }
}
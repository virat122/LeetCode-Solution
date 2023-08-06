/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
            ListNode fst=new ListNode(-1);
            ListNode snd=new ListNode(-1);
            
            ListNode temp= head;
            ListNode t1= fst;
            ListNode t2= snd;
        
            while(temp!=null){                
                if(temp.val < x){
                        t1.next=new  ListNode (temp.val);
                        t1=t1.next;
                }  else{
                        t2.next=new  ListNode (temp.val);
                        t2=t2.next;      
                }     
                    temp=temp.next;
            }
            t1.next=snd.next;
            return fst.next;
            
            
            
  
       // return head;
        
    }
}
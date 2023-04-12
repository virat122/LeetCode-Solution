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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode fast=head;
          ListNode slow=head;



        for(int i=0;i<=n;i++){
            if(fast==null)return head.next;
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
  
        return head;

        
        
       
    }
    
    //  public ListNode soln(ListNode head, int n){
    //      int c=0;
    //     ListNode  cur=head;

    //     while(cur!=null){
    //         cur=cur.next;
    //         c++;
    //     }

        
    //     if(n==c)return head=head.next;
    //     int pos=c-n;
    //     cur=head;

    //     for(int i=1;i<pos;i++){
    //         cur=cur.next;
    //     }

    //     if( cur.next!=null && cur.next.next!=null ){ 
    //         cur.next=cur.next.next;
    //     }
    //     else if( cur.next!=null) cur.next=null;

    //     System.out.println(cur.val);
    //    return head;
    //  }

}
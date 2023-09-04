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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        // while(head != null)
        // {
        //     ListNode cnext=head.next;
        //     head.next = prev ;
        //     prev=head;
        //     head=cnext;
        // }
        // return prev;
        return reverse(head,prev);
  }

  public ListNode reverse(ListNode head,ListNode newhead ) {

      if(head==null){
          return newhead;
      }
      ListNode temp=head.next;
      head.next=newhead;
      return reverse(temp,head);

  }


}
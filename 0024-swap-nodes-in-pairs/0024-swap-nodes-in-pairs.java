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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode current=head;
       
       ListNode pre=dummy;
        dummy.next=head;



        while(current!=null && current.next!=null){
            pre.next=current.next;
            current.next=current.next.next;
            pre.next.next=current;

            current=current.next;
            pre=pre.next.next;
        }     
        return dummy.next;
    }
}
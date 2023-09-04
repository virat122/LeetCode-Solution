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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=slow;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;
        }
        if(fast.next!=null){
            slow.next=slow.next.next;
        }else{
            pre.next=slow.next;
        }
        return head;
        
        
    }
}
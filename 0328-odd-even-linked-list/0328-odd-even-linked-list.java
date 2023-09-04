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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return head;

        ListNode  h1=head;
        ListNode  h2=head.next;
        ListNode  fst=head;
        ListNode  scnd=head.next;
      

        while(fst.next!=null && scnd.next!=null){
            fst.next=fst.next.next;
            fst=fst.next;

            scnd.next=scnd.next.next;
            scnd=scnd.next;

        }
        fst.next=h2;
        return h1;







        
    }
}
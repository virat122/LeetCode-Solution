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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode lst=head;
        ListNode fst=head;
        ListNode cur=head;
        int c=1;
        while(cur!=null){
            if(c<k){
                fst=fst.next;
            }
             if(c>k){
                lst=lst.next;

            }
            cur=cur.next;
            c++;
        }
      
    int t=fst.val;
    fst.val=lst.val;
    lst.val=t;

      return head;




     
    }


    // psvm(){
    //         ListNode lst=head;
    //     ListNode fst=head;
    //     ListNode slow=head;

    // for(int i=1;i<k+1;i++){
    //     if(i<k)fst=fst.next;
    //     lst=lst.next;
    // }

    // while(lst!=null){
    //     slow=slow.next;
    //      lst=lst.next;
    // }
    // System.out.println("fst"+ fst.val);
    //  System.out.println("slw"+ slow.val);


    // int t=fst.val;

    // fst.val=slow.val;
    // slow.val=t;
    // return head;
    // }
}
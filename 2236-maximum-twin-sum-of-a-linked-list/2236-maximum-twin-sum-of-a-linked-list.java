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
    public int pairSum(ListNode head) {
        ListNode cur=head;

        
       








 List<Integer> temp=new ArrayList<>();
        while(cur!=null){
            temp.add(cur.val);
            cur=cur.next;
        }

        int i=0;
        int j=temp.size()-1;
        int max=1;
        while(i<j){

            int p=temp.get(i++)+temp.get(j--);
            if(p>max)max=p;

        }
        return max;
        
    }
}
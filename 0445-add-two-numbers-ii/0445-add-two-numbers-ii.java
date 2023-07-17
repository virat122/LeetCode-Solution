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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    List<Integer> a=new ArrayList<>();
    List<Integer> b=new ArrayList<>();
   // ListNode  dummy=new ListNode (-1);
    ListNode pre=null;
    while(l1!=null){
        a.add(l1.val);
        l1=l1.next;
    }
    while(l2!=null){
        b.add(l2.val);
        l2=l2.next;
    }
    int i=a.size()-1;
    int j=b.size()-1;
    int c=0;

    while(i>=0 && j>=0){
        int t=a.get(i)+b.get(j)+c;
        c=t/10;
        t=t%10;

       ListNode p =new ListNode (t);
       p.next=pre;
        pre=p;
        i--;
        j--;
    }
     while(i>=0){
        int t=a.get(i)+c;
        c=t/10;
        t=t%10;
        ListNode p =new ListNode (t);
       p.next=pre;
        pre=p;
        i--;
    }
     while( j>=0){
        int t=b.get(j)+c;
        c=t/10;
        t=t%10;
        ListNode p =new ListNode (t);
       p.next=pre;
        pre=p;
        j--;
    }
    if(c!=0){
       ListNode p =new ListNode (c);
       p.next=pre;
        pre=p;
    }


    
return pre;


        
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
         ListNode fast =head;
        
        
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             
             if(slow==fast){
                 return true;
             }
         }
        return false;
    }

// public boolean hasCycle(ListNode head) {

//     ListNode slow= head;
//     ListNode fast=head;
//     while(fast!=null&& fast.next!=null){
 //         fast=fast.next.next;
//         slow=slow.next;

//         if(fast==slow )return true;
//        
//     }
//     return false;


// }

// public boolean hasCycle(ListNode head) {
    
//    HashSet set =new HashSet<>();
//     ListNode ele=head;
//      while (ele!=null){
//          if(set.contains(ele)){
//              return true ;
//          }
//          set.add(ele);
//          ele=ele.next;
//      }
//     return false;
        
//     }
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
            HashMap< Node , Node > hm=new HashMap<>();
                
            Node dummy=new Node (-1);
            Node pre=dummy;
            Node cur=head;
           while(cur!=null){
                   pre.next=new Node(cur.val);
                   pre=pre.next;
                   hm.put(cur,pre);
                   cur=cur.next;         
           }
            cur=head;
            Node ans=dummy.next;
            while(cur!=null){
                    Node t=cur.random;
                   Node t2= hm.get(t);
                    ans.random=t2;
                    
                    cur=cur.next;
                    ans=ans.next;
                    
                    
            }
            return dummy.next;
            
    }
}
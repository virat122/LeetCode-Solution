/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
            
        List<List<Integer>> ans=new ArrayList<>();

        Queue<Node> q=new  LinkedList<>();

        if(root==null)return root;

        List<Integer> sub=new ArrayList<>();
        
        
        q.add(root);
        root.next=null;
        q.add(null);
        while(!q.isEmpty()){
           Node cur=q.remove();
            if(cur==null){
                ans.add(sub);
                if(q.isEmpty()){
                    break;
                }else{
                    sub=new ArrayList<>();
                    q.add(null);
                }
            }else{
                    cur.next=q.element();
                sub.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
                
            }

        }
        return root;
        
    }
}
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
            
            ArrayList<Integer> ans=new ArrayList<>();
            while(head!=null){
                    ans.add(head.val);
                    head=head.next;
            }
            return BST(0,ans.size()-1,ans);
            
    }
          public TreeNode BST(int i,int j,ArrayList<Integer> ans){
                  if(i>j)return null;
                  
                  int m=(i+j)/2;
                  TreeNode root=new TreeNode (ans.get(m));
                  root.left=BST(i,m-1,ans);
                    root.right=BST(m+1,j,ans);
                  return root;
          }
}
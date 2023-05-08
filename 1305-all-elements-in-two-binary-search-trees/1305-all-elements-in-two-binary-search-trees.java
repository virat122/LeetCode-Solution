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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> a1=new ArrayList<Integer>();
           
            pre(root1,a1);
              pre(root2,a1);
            Collections.sort(a1);
            return a1;
            
                    
    }
    public void pre(TreeNode root, List<Integer> a){
            if(root==null){
                    return ;
            }
           pre(root.left,a);
            a.add(root.val);
            pre(root.right,a);
            
           
    } 
}
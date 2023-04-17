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
        int size=0;
    public int countNodes(TreeNode root) {
           countN(root);  
           
       return size; 
            
            
    }
        public void  countN(TreeNode root) {
                 if(root==null){
                    return  ;
                  }
                
                countN(root.left);
                size++;
                countN(root.right);
                
                
        }
}
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
        long m1=Long.MAX_VALUE;
          long m2=Long.MAX_VALUE;
        void trvs(TreeNode root){
                if(root==null)return ;
                if(root.val<m1){
                        m2=m1;
                        m1=root.val;
                }else 
                if(root.val<m2 && root.val!=m1){
                        m2=root.val;
                }
                trvs(root.left);
                trvs(root.right);
                
        }
    public int findSecondMinimumValue(TreeNode root) {     
            
            trvs(root);
            
            return Long.MAX_VALUE==m2?-1:(int)m2;
        
    }
         
}
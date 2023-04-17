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
        
      
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }


//     public int hieght(TreeNode root){
//         if(root == null )return 0;

//         int l=hieght(root.left);
//         int r=hieght(root.right);
//         return( Math.max(l,r))+1;
    
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root== null) return true;
        
            
//           int left= hieght( root.left);
//           int  right=  hieght( root.right);
//           if(Math.abs(left-right)>=2)
//                   return false;
         
//         return isBalanced(root.left)&&isBalanced(root.right);
            
        
//     }
}
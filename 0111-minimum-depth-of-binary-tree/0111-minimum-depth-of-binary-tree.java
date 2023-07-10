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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c1=minDepth(root.left);
        int c2=minDepth(root.right);
        int c3;
        if(c1==0|| c2==0)  c3=c1+c2;
        else
        c3=c1>c2?c2:c1;
        return 1+c3;
        
        
    }
    
    
}
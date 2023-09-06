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
  int count=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftc=maxDepth(root.left);
        int rightc=maxDepth(root.right);
        
        return 1+(leftc>rightc?leftc:rightc);
        
        
    }
//  / public  int depth(TreeNode root){
//         if(root==null){        
//             return 0;
//         }
//       return  depth( root.left, lc++,rc)< depth( root.right, lc,rc++) ? depth( root.right, lc,rc++):depth( root.left, lc++,rc);
            
        
//     }
    
}
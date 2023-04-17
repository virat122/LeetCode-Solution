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
    public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans=new ArrayList<>();  
            
            binary(root,ans,"");
            return ans;
            
    }
    public void binary(TreeNode root,List<String>ans,String s){
            if(root==null)return;
            
            if(root.left==null && root.right==null){
                     s=s+"->"+root.val;
                    ans.add(s.substring(2));
                    s="";
                    return;            
                    
            }
            
            s=s+"->"+root.val;
            binary(root.left,ans,s);
            binary(root.right,ans,s);
    }
}
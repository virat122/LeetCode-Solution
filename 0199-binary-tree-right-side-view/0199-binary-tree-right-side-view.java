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
    public List<Integer> rightSideView(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
       

        rightview(root,ans,0);
        List<Integer> a=new ArrayList<Integer>();
        for(TreeNode i:ans){
            a.add(i.val);
        }
        return a;

        
        
    }
    public void rightview(TreeNode root,List<TreeNode> ans,int level){

        if(root==null)return;
        if(ans.size()<=level){
            ans.add(root);
        }
        rightview(root.right,ans,level+1);
        rightview(root.left,ans,level+1);
    }

}
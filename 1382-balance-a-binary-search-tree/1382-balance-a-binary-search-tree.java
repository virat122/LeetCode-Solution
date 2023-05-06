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
    public TreeNode bst(List<Integer>pre,int st,int ed) {
        if(st>ed){
            return null;
        }
       int mid=(st+ed)/2;
       TreeNode root=new TreeNode (pre.get(mid)) ;
       root.left=bst(pre,st,mid-1);
       root.right=bst(pre,mid+1,ed);

       return root;  
    }
    List<Integer>arr=new ArrayList<Integer>();
    public void  inorder(TreeNode root){
        if(root==null)return ;

            inorder( root.left);
            arr.add(root.val);
            inorder( root.right);
    }

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
       // Collections.sort(arr);
        return bst(arr,0,arr.size()-1);

    }
}
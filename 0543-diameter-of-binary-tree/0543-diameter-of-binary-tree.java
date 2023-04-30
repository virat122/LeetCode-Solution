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
    static class  Info {
        int dia;
        int ht;
       public Info(int dia,int h){
            this.dia=dia;
            this.ht=h;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;



    }
    public Info diameter(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftinfo=diameter(root.left);
        Info rightinfo=diameter(root.right);

        int dimtr=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht);
        int hite=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new Info(dimtr,hite);
    }


    public int diameterOfBinary(TreeNode root) {
        if(root==null)
            return 0;

        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);

        int lh=hiegth(root.left);
        int rh=hiegth(root.right);
        int selfd=lh+rh;

        return Math.max(Math.max(ld,rd),selfd);
         
    }
    public int hiegth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftH=hiegth(root.left);
        int rightH=hiegth(root.right);
        return Math.max(leftH,rightH)+1;
    }
}
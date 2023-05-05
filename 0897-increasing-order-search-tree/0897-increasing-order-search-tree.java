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
       
  ArrayList<Integer> ans=new ArrayList<>(); 
    public TreeNode increasingBST(TreeNode rot) {
        if(rot==null)return null;
            inorder(rot);
          TreeNode root=new TreeNode(-1);
          TreeNode dummy=root;
            for(int i=0;i<ans.size();i++){
                    root.right=new  TreeNode (ans.get(i));
                   
                   //   System.out.println(ans.get(i));
                    root=root.right;
       
            }
        return dummy.right;
    }
         
       
    public void inorder(TreeNode root){
         if(root==null) return ;
            inorder(root.left);
         
            ans.add(root.val);
            
            inorder(root.right);

           
    }

}
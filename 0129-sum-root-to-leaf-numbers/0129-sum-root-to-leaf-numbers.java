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
    public int sumNumbers(TreeNode root) {
            List<String>lst=new ArrayList<>();
            
          sum(root,lst,"");
            int ans=0;
            for(int i=0;i<lst.size();i++){
                    
                 int t=Integer.valueOf(lst.get(i))  ; 
                    ans+=(int)t;
            }
            
            
            return ans;
            
    }
    public void sum(TreeNode root ,List<String>lst,String s){
            if(root==null)return ;
            if(root.left==null && root.right==null){
                    s+=root.val;
                    lst.add(s);
                    s="";
            }
            s+=root.val;
            sum(root.left,lst,s);
            sum(root.right,lst,s);    
    }
        
        
}

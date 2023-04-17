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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>>ans= new ArrayList<>();
            if(root==null)return ans;
            Queue<TreeNode> q=new LinkedList<>();
            
            q.add(root);
            
            
            q.add(null);
            List<Integer> sub=new ArrayList<>();
            
            while(!q.isEmpty()){
                    
                    TreeNode temp=q.remove();
                    if(temp==null){
                            ans.add(sub);
                            if(q.size()==0){
                                break;    
                            }
                            else{
                                  sub=new ArrayList<>();    
                                    q.add(null);
                            }
                    }else{
                            sub.add(temp.val);
                            if(temp.left!=null){
                                    q.add(temp.left);
                            }
                            if(temp.right!=null){
                                    q.add(temp.right);
                            }
                    }
                    

                    
            }
            Collections.reverse(ans);
            return ans;
            
            
            
            
            
        
        
    }
}
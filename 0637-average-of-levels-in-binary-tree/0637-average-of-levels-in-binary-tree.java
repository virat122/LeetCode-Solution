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
         
    public List<Double> averageOfLevels(TreeNode root) {
             List<Double> ans=new ArrayList<>() ;
          

            int len=height(root);
            int fre[]=new int [len];
            double sum[]=new double [len];


            average(root,0,fre,sum);

            for(int i=0;i<len;i++){
                    double temp=sum[i]/fre[i];
                    ans.add(temp);
            }
            return ans;
         
            
            
            
        
    }
         public void average(TreeNode root,int level,int[] fre,double []sum){
                 
                 if(root==null)return;
                 fre[level]++;
                 sum[level]=sum[level]+(double)root.val;
                // System.out.println(sum[level]+"  "+fre[level]+" "+level)   ;           
                 average(root.left,level+1,fre,sum);
                 average(root.right,level+1,fre,sum);
                 
                 
         }

         public int height(TreeNode root){
                 if(root==null)return 0;

                 int l=height(root.left);
                  int r=height(root.right);

                  return Math.max(l,r)+1;
         }



        //  / if(ans.size()>level){
        //                  double t=ans.get(level)+root.val;
        //                  ans.add(level,t);
        //                  int idx=fre.get(level)+1;
        //                  fre.add(level,idx);
                         
        //          }else{
        //                  ans.add((double)(root.val));
        //                  fre.add(1);
        //          }
}
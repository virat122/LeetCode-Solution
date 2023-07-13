class Solution {
   public int soln(int[] nums,int i,int []dp) {
            if(i>=nums.length)return 0;
           if(nums.length==1)return nums[0];
           if(dp[i]!=-1){
                   return dp[i];
           }
           int a1=soln(nums,i+2,dp)+nums[i];
            int a2=soln(nums,i+1,dp)+0;
          
                   dp[i]=Math.max(a1,a2);
            return dp[i];
            
        
    }
    public int rob(int[] nums) {

              int n=nums.length;
             int dp[]=new int [n];
            Arrays.fill(dp,-1);
//            return Math.max (soln(ar1,0),soln(ar2,0)) ;
            return soln(nums,0,dp);
        
    }
}
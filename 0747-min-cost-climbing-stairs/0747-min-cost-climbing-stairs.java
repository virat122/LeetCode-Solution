class Solution {
    public int minCostClimbingStairs(int[] cost) {
            int dp[]=new int [cost.length+2];
            Arrays.fill(dp,-1);
            return Math.min(min(cost,0,dp),min(cost,1,dp));
        
    }
    public int min(int[] cost, int s ,int dp[] ) {
            if(s>=cost.length){
                    return 0;
            }
            if(dp[s]!=-1){
                    return dp[s];
            }
            
            int a=cost[s]+min(cost,s+1,dp);
           
            int  b=cost[s]+min(cost,s+2,dp);
            return dp[s]=Math.min(a,b);
        
    }
}
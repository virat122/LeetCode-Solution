class Solution {
    public int deleteAndEarn(int[] nums) {
            int arr[]=new int [10001];
            
            for(int i:nums){
                 arr[i]+=i;   
            }
            int dp[]=new int [10001];
            dp[1]=arr[1];
            for(int i=2;i<10001;i++){
                    dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
            }
            return dp[10000];
    }
    
}
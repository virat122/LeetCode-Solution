class Solution {
    public int nthUglyNumber(int n) {
            
            int dp[]=new int [n+1];
            dp[1]=1;
            
            int pointer1=1;
            int pointer2=1;
            int pointer3=1;
            
            for(int i=2;i<=n;i++){
                    int f1=2*dp[pointer1];
                    int f2=3*dp[pointer2];
                    int f3=5*dp[pointer3];
                    dp[i]=Math.min(f1,Math.min(f2,f3));
                    if(dp[i]==f1)pointer1++;
                    if(dp[i]==f2)pointer2++;
                    if(dp[i]==f3)pointer3++;
            }
            return dp[n];
        
    }
}
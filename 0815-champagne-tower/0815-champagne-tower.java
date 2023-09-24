class Solution {
    public double champagneTower(int poured, int row, int jglass) {
        double dp[][]=new double[101][101];
        for(int i=0;i<101;i++){
            Arrays.fill(dp[i],-1);
        }
        return Math.min(1.0,soln( poured,row, jglass,dp));

        
    }
    double soln(int poured,int i,int j,double[][]dp){
        if(i<0 || j<0|| i<j)return 0.0;
        if(i==0 && j==0){
            return poured;
        }
        if(dp[i][j]!=-1)return dp[i][j];

        double left=(soln(poured,i-1,j-1,dp)-1)/2.0;
        double right=(soln(poured,i-1,j,dp)-1)/2.0;
        left =left<0?0:left;
        right=right<0?0:right;
        
        return dp[i][j]= left+right;


    }
}
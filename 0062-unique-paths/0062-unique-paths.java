class Solution {
    public int uniquePaths(int m, int n) {
      // System.out .print( solution (1,1,m,n,0) );
      int [][]arr=new int [m+1][n+1];
      for (int i=0;i<m ;i++)
      Arrays.fill(arr[i],-1);
        return solution (0,0,m,n,arr) ;
        
    }
    public int solution (int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int a=0,b=0;
        if(i<m){
         a= solution(i+1,j,m,n,dp);

        }
        if(j<n){
       b=    solution(i,j+1,m,n,dp);

        }

        
        
        return dp[i][j]=(a+b);
    }
}
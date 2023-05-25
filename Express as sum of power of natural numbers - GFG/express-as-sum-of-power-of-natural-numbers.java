//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int x = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numOfWays(n, x));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution
{
    static int numOfWays(int n, int x)

    {
        // code here
        int max = (int)Math.pow(n,1.0/(double)x);
        int[][] dp = new int[max+1][n+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
       int count = solve(n,max,x,dp); 
       return count;
    }
    static int solve(int n ,int max ,int x,int[][] dp){
        if(n==0){
            return 1;
        }
        if(max==1){
            if ((1 == n)) return 1;
            else return 0;
        }
        if(dp[max][n]!=-1) {
            return dp[max][n];
        }
            int notpick = solve(n, max - 1, x, dp);
            int pick = 0;
            if (Math.pow(max, x) <= n) {
                pick = solve(n - (int) Math.pow(max, x), max - 1, x, dp);
            }
        dp[max][n] = (notpick+pick)%1000000007;
        return (notpick+pick)%1000000007;
    }
}
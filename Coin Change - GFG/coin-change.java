//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java



// User function Template for Java



// User function Template for Java

class Solution {
    public long count(int a[], int n, int t) {
        long[][] dp = new long[n][t+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1); 
        }
        return f(a,n-1,t,dp); 
    }
    
    public long f(int[] a, int n, int t, long[][] dp){
        if(t==0){
            return 1;
        }
        if(n==0){
            if(t%a[n]==0){
                return 1; 
            }else{
                return 0; 
            }
        }
        if(n>=0&&dp[n][t]!=-1){return dp[n][t];}
        long nT=0, take = 0; 
        if(n>=0&&a[n]<=t){
            take = f(a,n,t-a[n],dp); 
        }
        if(n>=0){
            nT= f(a,n-1,t,dp);
        }
        return dp[n][t]=take+nT; 
    }
}
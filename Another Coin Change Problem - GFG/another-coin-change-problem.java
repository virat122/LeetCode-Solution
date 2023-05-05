//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int N;
            N = Integer.parseInt(br.readLine());

            int K;
            K = Integer.parseInt(br.readLine());

            int target;
            target = Integer.parseInt(br.readLine());

            int[] coins = IntArray.input(br, N);

            Solution obj = new Solution();
            boolean res = obj.makeChanges(N, K, target, coins);

            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends




class Solution {
    public static int fun(int i,int target,int k,int[] coins,int[][][] dp)
    {
        if(k==0)
        {
          if(target==0)
            return 1;
          return 0;
        }
        if(i==coins.length)
         return 0;
        if(dp[i][target][k]!=-1)
          return dp[i][target][k];
        int pick=0;
        if(target-coins[i]>=0)
         pick=fun(i,target-coins[i],k-1,coins,dp);
        int notpick=fun(i+1,target,k,coins,dp);
        return dp[i][target][k]=pick+notpick;
    }
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        int[][][] dp=new int[N][target+1][K+1];
        for(int[][] arr:dp)
        {
            for(int[] a:arr)
            {
                Arrays.fill(a,-1);
            }
        }
        return fun(0,target,K,coins,dp)==0?false:true;
    }
}

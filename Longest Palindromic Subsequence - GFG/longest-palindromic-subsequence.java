//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        // Create a 2D array to store the lengths of the longest palindromic subsequences
        int[][] dp = new int[n][n];

        // All substrings of length 1 are palindromic, so set the diagonal elements to 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Loop through the string to fill the dp table diagonally
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                // If the first and last characters are the same, add 2 to the length of the palindromic subsequence
                if (S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][n - 1];

    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends




//User function Template for Java
//User function Template for Java

class Solution{
    static String longestPalin(String S){
          int n = S.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        // Initialize single character palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromes of length 2 or more
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;

                // Check if S[i...j] is a palindrome
                if (S.charAt(i) == S.charAt(j)) {
                    if (length == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        // Update maximum palindrome length and starting index
                        if (length > maxLength) {
                            maxLength = length;
                            start = i;
                        }
                    }
                }
            }
        }

        // Extract the largest palindrome substring
        return S.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String inputString = "babad";
        String result = longestPalin(inputString);
        System.out.println(result);
        
    }
}
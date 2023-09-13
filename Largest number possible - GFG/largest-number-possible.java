//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
        //A number N digits can only have a max sum of N*9 
        //Ex:2 N = 99 Sum = 18 we can't have acheive a sum beyond 18
        int maxPossibleSum = N*9;
        if(S > maxPossibleSum){
            return "-1";
        }
        if(S == 0 && N > 1){
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        while(N > 0){
            int digit = Math.min(S,9);
            sb.append(digit);
            S-=digit;
            N--;
        }
        return sb.toString();
    }
}
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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        long ans=0;
        for(int i=2;i*i<=N;i++){
            while(N%i==0){
                ans=i;
                N=N/i;
            }
        }
            if(N>1)return N;
            return ans;
        
    }
}
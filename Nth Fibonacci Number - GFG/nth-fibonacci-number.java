//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int nthFibonacci(int n){
        if(n==0) return 0;
        
        int a=0,b=1;
        int mod=(int)1e9+7;
        n-=2;
        while(n-->=0)
        {
            int c=(a%mod+b%mod)%mod;
            a=b;
            b=c;
        }
        
        return b;
    }
}
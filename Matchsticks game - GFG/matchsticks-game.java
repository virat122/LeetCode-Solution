//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.matchGame(N));
        }
    }
}
// } Driver Code Ends



//User function Template for Java

class Solution {
    static int matchGame(Long N) {
           if((N%5L)==0){
            return -1;
        }
        return(int)(N%5L);
    }
};
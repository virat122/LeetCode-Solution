//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
   static boolean lemonadeChange(int N, int bills[]) {
        int f=1;
        int tn=0;
        int tw=0;
        if(bills[0]!=5){
            return false;
        }
        for(int i=1;i<N;i++){
            if(bills[i]==5){
                f++;
            }
            else if(bills[i]==10){
                if(f>=1){
                    f--;
                    tn++;
                }
                else{
                    return false;
                }
            }
            else{
                if(f>=1 && tn>=1){
                    f--;
                    tn--;

                    tw++;
                }
                else if(f>=3){
                    f-=3;
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
}
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
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{

   static int nextHappy(int N){
        // code here
        int n = N+1;
        HashSet<Integer> set = new HashSet<>(); // if sum of square repeat then we not take 'n'
        while(true) {
            
            int temp = n;
            while(!set.contains(n)) { // check for n && if it not in set.
                set.add(n); // add in set
                int sq = 0;
                while(n!=0) { // digits & square of sum
                    int rem = n%10;
                    sq += rem*rem;
                    n /= 10;
                }
                if(sq == 1) { // sq == 1 ---> ans = real n = temp
                    return temp;
                } else {
                    n = sq; // check for next n which is replace by sq.
                }
            }
            n = temp;
            n++;
        }
        // return 0;
    }
}
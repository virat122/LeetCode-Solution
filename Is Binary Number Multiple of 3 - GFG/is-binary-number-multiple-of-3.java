//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends



//User function Template for Java

class Solution {
    int isDivisible(String s) {
        int n = 0;
        int m = 0;
        for(int i = 0; i<s.length(); i++){
           
        if(s.charAt(i) == '1'){
            if(i%2 == 0)
            m++;
            else
            n++;
        }
        }
        if((n-m)%3 == 0)
        return 1;
        else
        return 0;
        }
    }
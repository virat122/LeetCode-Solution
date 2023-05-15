//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            
            System.out.println(ob.cuts(s));
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java



//User function Template for Java
class Solution{
    static int cuts(String s)
    {
        // code here
        char c[]=s.toCharArray();
        int l=c.length;
        int dp[]=new int[l+1];
        dp[0]=0;
        for(int i=1;i<=l;i++)
        {
            int index=i-1;
            if(c[index]=='0'){dp[i]=-1;}
            else
            {
                dp[i]=-1;
                int t=1000;
                long count=0;
                for(int j=0;j<i;j++)
                {
                    if(c[index-j]=='1')
                    {
                        count+=num(j);
                        if(check(count)&dp[index-j]!=-1)
                        {
                            int w=1+dp[index-j];
                            t=(w<t)?w:t;
                        }
                    }
                }
                if(t!=1000){
                    dp[i]=t;
                    
                }
            }
        }
        
        return dp[l];
    }
    static long num(int y)
    {
        if(y==0)return 1;
        long x=2;
        for(int i=1;i<y;i++)
        {
            x=x<<1;
        }
        return x;
    }
    static boolean check(long n)
    {
        if(n==0){return false;}
        if(n==1){return true;}
        if(n%5!=0){return false;}
        else{return check(n/5);}
    }
}

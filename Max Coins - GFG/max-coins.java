//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG implements Runnable
{
    public static void main(String args[])throws IOException
    {
        new Thread(null, new GFG(), "whatever", 1<<26).start();
    }
    public void run()
    {
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t=Integer.parseInt(in.readLine());
            while(t-->0){
                int n=Integer.parseInt(in.readLine().trim());
                int a[][]=new int[n][3];
                for(int i=0;i<n;i++){
                    String s[]=in.readLine().trim().split(" ");
                    a[i][0]=Integer.parseInt(s[0]);
                    a[i][1]=Integer.parseInt(s[1]);
                    a[i][2]=Integer.parseInt(s[2]);
                }
                Solution ob=new Solution();
                out.println(ob.maxCoins(n,a));
            }
            out.close();
        }catch(Exception e){
            ;
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution{
    static int dp[][];
    public static int maxCoins(int n,int ranges[][])
    {
        Arrays.sort(ranges,new Comparator<int[]>(){
            public int compare(int first[],int second[]){
                if(first[0]==second[0])
                return first[1]-second[1];
                else
                return first[0]-second[0];
            }
        });
        dp=new int[n+1][3];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(ranges,0,0);
    }
    public static int fun(int ranges[][],int i,int taken)
    {
        
        if(i>=ranges.length || taken>1) return 0;
        if(dp[i][taken]!=-1){
            return dp[i][taken];
        }
        int ans=fun(ranges,i+1,taken);
        int new_idx=(int)(1e9),l=i+1,r=ranges.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ranges[mid][0]>=ranges[i][1]){
                new_idx=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        ans=Math.max(ans,fun(ranges,new_idx,taken+1)+ranges[i][2]);
        return dp[i][taken]=ans;
        
    }
}
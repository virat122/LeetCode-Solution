//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
     int dx[] = {-1,-1,0,1,1,1,0,-1};
    int dy[] = {0,1,1,1,0,-1,-1,-1};
    
    public static boolean isValid(int nx,int ny,int n,int m){
        if(nx < 0 || ny < 0 || nx >= n || ny >= m)
            return false;
        
             return true;
    }
    public int  Count(int[][] matrix)
    {
        int ans=0;
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0) continue;
                int cnt=0;
                
                int x=i;
                int y=j;
                
                for(int k=0;k<8;k++){
                    int nx = x+dx[k];
                    int ny = y+dy[k];
                    
                    if(isValid(nx,ny,n,m)){
                        if(matrix[nx][ny] == 0) cnt++;
                    }
                }
                
                if(cnt%2 == 0 && cnt != 0) ans++;
            }
        }
        
        return ans;
    }
}
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
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static void floodFillUtil(char screen[][], int x, int y, 
                        char prevC, char newC, int N, int M)
    {
        // Base cases
        if (x < 0 || x >= N || y < 0 || y >= M)
            return;
        if (screen[x][y] != prevC)
            return;
        // Replace the color at (x, y)
        screen[x][y] = newC;
        floodFillUtil(screen, x+1, y, prevC, newC, N, M);
        floodFillUtil(screen, x-1, y, prevC, newC, N, M);
        floodFillUtil(screen, x, y+1, prevC, newC, N, M);
        floodFillUtil(screen, x, y-1, prevC, newC, N, M);
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        char[][] temp = new char[n][m];;
        for(int i = 0; i<n; i++) {
		    for(int j = 0; j<m; j++) {
		        if(a[i][j] == 'O')
		            temp[i][j] = '-';
		        else
		            temp[i][j] = 'X';
		    }
        }
		
		for(int i = 0;i < n;i++)
			if(temp[i][0] == '-')
			    floodFillUtil(temp, i, 0, '-', 'O', n, m);
		
		for(int i = 0;i < n;i++)
			if(temp[i][m-1] == '-')
			    floodFillUtil(temp, i, m-1, '-', 'O', n, m);
			
		for(int i = 0;i < m;i++)
			if(temp[0][i] == '-')
			    floodFillUtil(temp, 0, i, '-', 'O', n, m);
			
		for(int i = 0;i < m;i++)
			if(temp[n-1][i] == '-')
			    floodFillUtil(temp, n-1, i, '-', 'O', n, m);
		
		for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				if(temp[i][j] == '-')
				    temp[i][j] = 'X';
	    return temp;
    }
}
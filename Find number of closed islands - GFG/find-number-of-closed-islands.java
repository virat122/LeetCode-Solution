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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    // DFS Traversal to find the count of
    // island surrounded by water
    static void dfs(int[][] matrix, boolean[][] visited,
                    int x, int y, int n, int m,
                    boolean[] hasCornerCell)
    {
         
        // If the land is already visited
        // or there is no land or the
        // coordinates gone out of matrix
        // break function as there
        // will be no islands
        if (x < 0 || y < 0 || x >= n || y >= m ||
            visited[x][y] == true || matrix[x][y] == 0)
            return;
     
        if (x == 0 || y == 0 ||
            x == n - 1 || y == m - 1)
        {
            if (matrix[x][y] == 1)
                hasCornerCell[0] = true;
        }
     
        // Mark land as visited
        visited[x][y] = true;
     
        // Traverse to all adjacent elements
        dfs(matrix, visited, x + 1, y, n, m,
            hasCornerCell);
        dfs(matrix, visited, x, y + 1, n, m,
            hasCornerCell);
        dfs(matrix, visited, x - 1, y, n, m,
            hasCornerCell);
        dfs(matrix, visited, x, y - 1, n, m,
            hasCornerCell);
    }
    public int closedIslands(int[][] matrix, int n, int m)
    {
        // Create boolean 2D visited matrix
        // to keep track of visited cell
     
        // Initially all elements are
        // unvisited.
        boolean[][] visited = new boolean[n][m];
        int result = 0;
         
        // Mark visited all lands
        // that are reachable from edge
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                if ((i != 0 && j != 0 &&
                     i != n - 1 && j != m - 1) &&
                     matrix[i][j] == 1 &&
                     visited[i][j] == false)
                {
     
                    // Determine if the island is closed
                    boolean[] hasCornerCell = new boolean[1];
                    hasCornerCell[0] = false;
     
                    // hasCornerCell will be updated to
                    // true while DFS traversal if there
                    // is a cell with value '1' on the corner
                    dfs(matrix, visited, i, j, n, m,
                        hasCornerCell);
     
                    // If the island is closed
                    if (!hasCornerCell[0])
                        result = result + 1;
                }
            }
        }
     
        // Return the final count
        return result;
    }
}
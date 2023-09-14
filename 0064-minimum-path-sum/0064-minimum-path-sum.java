class Solution {
   public int minPathSum(int[][] grid) {
        for(int i = 1; i < grid.length; i++)
            grid[i][0] += grid[i - 1][0];
        
        for(int j = 1; j < grid[0].length; j++)
            grid[0][j] += grid[0][j - 1];
        
        for(int i = 1; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        
        //for(int i = 0; i < grid.length; i++)
            //System.out.println(Arrays.toString(grid[i]));
        
        return grid[grid.length - 1][grid[0].length - 1];
    }


    public int minPath(int[][] grid,int i,int j){
        if(i==0 && j==0 )return grid[i][j];
        if(i==0) return grid[i][j]+minPath(grid,i,j-1);
         if(j==0)  return grid[i][j]+minPath(grid,i-1,j);
         return Math.min( minPath(grid,i-1,j), +minPath(grid,i,j-1))+grid[i][j];
   
    }



}
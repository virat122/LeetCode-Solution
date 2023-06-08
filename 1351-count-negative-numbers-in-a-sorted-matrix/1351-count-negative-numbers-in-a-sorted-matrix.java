class Solution {
    public int countNegatives(int[][] grid) {

        int c=0;

        for(int i=0;i<grid.length ;i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j]<0){
                    break;
                }
                c++;
            }           
        }

        return (grid.length * grid[0].length )-c;
        
    }
}
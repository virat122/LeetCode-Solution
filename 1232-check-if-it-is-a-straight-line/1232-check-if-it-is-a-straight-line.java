class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0], dy = coordinates[1][1] - coordinates[0][1];
        for (int i = 1; i < coordinates.length-1; i++)
            if(dx*(coordinates[i+1][1] - coordinates[i][1]) != dy*(coordinates[i+1][0] - coordinates[i][0])) return false;
        return true;
    }

      
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingDouble(o  ->  o[1]));

        int ans=0;
        int i=0;
        int j=0;
        while(i<points.length){
            int end=points[i][1];
            ans++;
            j=i+1;
            while( j<points.length && points[j][0]<=end){
                j++;
            }
            i=j;
        }
        return ans;
    }
}
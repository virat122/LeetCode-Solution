class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o  ->  o[0]));
        int pre=0;
        int ans=0;

        for(int cur=1;cur<intervals.length;cur++){
            if(intervals[pre][1]> intervals[cur][0]){

               ans++;

               if(intervals[pre][1]>=intervals[cur][1]){
                   pre=cur;
               }

            }else{
                pre=cur;
            }
        }

        return ans;
        
    }
}
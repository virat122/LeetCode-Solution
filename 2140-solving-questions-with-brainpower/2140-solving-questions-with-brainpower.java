class Solution {
    public long mostPoints(int[][] questions) {
            long max=0;
            int n=questions.length-1;
            long dp[]=new long[n+2] ;    
            
            for(int i=n;i>=0;i--){
              int points = questions[i][0];
              int jump = questions[i][1];

             int nextQuestion = Math.min(jump + i + 1, n+1);
                    
            long pointsFromThisQuestion = points + dp[nextQuestion];
            dp[i] = Math.max(pointsFromThisQuestion, dp[i + 1]);
                  
            }
            return dp[0];
    }
}
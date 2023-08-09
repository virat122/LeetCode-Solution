class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
            if(s1.length() +s2.length()!=s3.length())return false;
            return soln(s1,s2,s3,0,0, new int [s1.length()+1][s2.length()+1])==1?true :false;
            
            
        
    }
    public int  soln(String s1, String s2, String s3,int i,int j,int  dp[][]) {
            if(i==s1.length() && j==s2.length())return 1;
            
            if(dp[i][j] != 0)return dp[i][j];
            
            
            if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
                    int  b=soln(s1,s2,s3,i+1,j,dp);
                    dp[i][j]=b;
                    if(b==1)return 1;
            }
            if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
                    int b=soln(s1,s2,s3,i,j+1,dp);
                     dp[i][j]=b;
                    if(b==1)return 1;
            }
            return  dp[i][j]=-1;
            
            
            
        
    }
}
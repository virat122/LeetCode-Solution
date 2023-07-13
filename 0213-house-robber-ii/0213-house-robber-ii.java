class Solution {
    public int sln(int[] nums,int i,int []dp) {
                if(i>=nums.length){
                        return 0;
                }
               
             if(nums.length==1){
                    return nums[0];
                }
            if(dp[i]!=-1)return dp[i];
            
            int inc=sln(nums,i+2,dp)+nums[i];
             
            int exc=sln(nums,i+1,dp)+0;
            
            dp[i]=Math.max(inc,exc);
            return dp[i];

    }
        
    public int rob(int[] nums) {
             if(nums.length==1){
                    return nums[0];
                }
            int n=nums.length;
            int ar1[]=new int [n-1];
             int ar2[]=new int [n-1];
             int d1[]=new int [n-1];
             int d2[]=new int [n-1];
            Arrays.fill(d1,-1);
            Arrays.fill(d2,-1);
            int j=0,k=0;
            for(int i=0;i<n;i++){
                    if(i!=0){
                        ar1[j++]=nums[i];    
                    }
                    if(i!=n-1){
                            ar2[k++]=nums[i];
                    }
            }
            
            
            
               return Math.max (sln(ar1,0,d1),sln(ar2,0,d2)) ;
            
        
    }
}
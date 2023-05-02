class Solution {
    public int maxAscendingSum(int[] nums) {
            
            int max=nums[0];
            
            for(int i=0;i<nums.length;i++){
                    int t=0;
                    int j=i;
                    while(j<nums.length-1 && nums[j]<nums[j+1]){
                            t+=nums[j];
                            j++;
                    }
                    t+=nums[j];
                    if(max<t)max=t;
                    
                    i=j;
                    
            }
            return max;
            
            
            
        
    }
}
class Solution {
    public boolean isMonotonic(int[] nums) {
            
            if (nums.length==1)return true;
            
            boolean as=(nums[0]-nums[nums.length-1]) <= 0?true :false;
            int pre=nums[0];
            
            for(int i=1;i<nums.length;i++){
                    if(as){
                             if(!(nums[i]>=pre))return false;
                    }else{
                             if(!(nums[i]<=pre))return false;
                    }
                    pre=nums[i];
                   
                 
            }
      return true;
    }
}
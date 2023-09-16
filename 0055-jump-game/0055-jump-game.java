class Solution {
      public boolean canJump(int[] nums) {
        int cur=nums[0];
        for(int i=0;i<nums.length;i++){
            
            if( cur<nums[i]){
                 cur=nums[i];
            }
            if(cur==0 && i+1!= nums.length ){
                return false;
            }
            cur--;  
        }
        return true;
        
    }
   

}
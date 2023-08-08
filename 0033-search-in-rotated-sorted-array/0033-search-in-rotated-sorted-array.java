class Solution {
    public int search(int[] nums, int t) {

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==t){
        //         return i;
        //     }

        // } 
        // return -1;   
        return searc(nums,t,0,nums.length-1);
    }
     public int searc(int[] nums,int t,int si,int ei){
         if(si>ei){
             return -1;
         }

         int mid=si+(ei-si)/2;
         if(nums[mid]==t){
             return mid;
         }
        
                if(nums[mid]>=nums[si]){
                    if(nums[si] <= t && t <= nums[mid]){
                        return searc(nums,t,si,mid-1);
                    }else{
                        return searc(nums,t,mid+1,ei);
                    }
                }
               

                else{
                    if(nums[mid] <= t && t <= nums[ei]){
                        return searc(nums,t,mid+1,ei); 
                    }else{
                        return searc(nums,t, si,mid-1);
                    }
                }
        
      


     }
}
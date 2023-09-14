class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start=0;
        int end=nums.length-1;
         while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return start;
        
        
        //  int mid=0;
        // int s=0;
        // int temp=0;
        // int lst=nums.length-1;
        // while (s<=lst){
        //     mid=(s+lst)/2;
        //     if(target==nums[mid]){
        //         return mid;
        //     }
        //     else if(target>nums[mid]){
        //         if((mid+1)>=nums.length ){
        //             temp=nums.length;
        //         }
        //        else if(target>nums[mid+1]){
        //         temp=mid+1;}
        //         else{
        //             temp=mid;
        //         }
        //         s=s+1;
        //     }else if (target<nums[mid]){
        //         if((mid-1)<0 ){
        //             temp=0;
        //         }
        //          else if( target<nums[mid-1]){
        //         temp=mid-1;}
        //         else{
        //             temp=mid;
        //         }
        //         lst=lst-1;
        //     }
        // }
        // return temp;
    }
}
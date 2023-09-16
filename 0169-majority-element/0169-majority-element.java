class Solution {
    public int majorityElement(int[] nums) { 
        
        Arrays.sort(nums);
        return nums[(nums.length/2)];
//         int count=0;
//         int p=0;
//         for(int  i=0;i<nums.length;i++)       
//         {
//            int max=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     max++;
//                 }
//             }
//             if(count<max){
//                 count =max;
//                 p=i;
//             }
            
//         }
//         return nums[p];
        
    }
}
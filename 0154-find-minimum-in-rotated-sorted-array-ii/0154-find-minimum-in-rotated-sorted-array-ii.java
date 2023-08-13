// class Solution {
//     public int findMin(int[] nums) {
//         // Arrays.sort(nums);
//         // return nums[0];
//         // int min=nums[0];
//         // for(int i=1;i<nums.length;i++){
//         //     if(min>nums[i]) min=nums[i];
//         // }
//         // return min;
//                        return 9;

//     }
        
//         public int binsearch(int[] nums,int s,int l) {
//                 int mid=(s+l)/2;
//                                return 9;

//     }
// }
class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        
        while(lo < hi){
            int mid = (lo + hi)/2;
            
            if(nums[mid] < nums[hi]){
                hi = mid;
            }else if(nums[mid] == nums[hi]){
                hi--;
            }
            else{
                lo = mid + 1;
            }
        }
        
        return nums[lo];
    }
}
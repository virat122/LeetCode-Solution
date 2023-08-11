class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        return min;
        
    }
}
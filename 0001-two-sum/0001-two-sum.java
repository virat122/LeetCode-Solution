class Solution {
    public int[] twoSum(int[] nums, int target) {
        int id1[]=new int[2];
        for (int i=0;i<nums.length;i++){
             for (int j=0;i!=j&&j<nums.length;j++){
                 if (nums[i]+nums[j]==target){
                     id1[0]=i;
                     id1[1]=j;
                     break;
                 }        
        }
           
}
         return id1;
    }
}
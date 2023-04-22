class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        // int [] temp =new int[nums.length-1];
        // temp[0]=nums[0];
        for(int i=0;i<nums.length;i++){
            if(j==0||nums[j-1]!=nums[i]){
                
                nums[j]=nums[i];
                j++;
            }
            
        }
        return j;
        
    }
}
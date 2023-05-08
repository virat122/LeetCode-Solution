class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int n=nums.length;
            int sum=0;
            int left=0;
            int right=0;
            int minsize=Integer.MAX_VALUE;
            
            while(right<n){
                    sum+=nums[right];
                    if(sum>=target){
                            while(sum>=target){
                                    sum-=nums[left];
                                    left++;         
                            }
                            int size=right-left+2;
                            minsize=Math.min(minsize,size);
                            
                            
                    }
                    right++;
            }
            return minsize==Integer.MAX_VALUE?0:minsize;
        
    }
}
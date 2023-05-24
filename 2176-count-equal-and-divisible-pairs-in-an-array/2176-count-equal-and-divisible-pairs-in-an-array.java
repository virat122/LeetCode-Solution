class Solution {
    public int countPairs(int[] nums, int k) {
            
            int c=0;
            for(int i=1;i<nums.length;i++){
                    for(int j=0;j<i;j++){
                            if(nums[i]==nums[j] && (i*j)%k==0){
                                    c++;
                            }
                                    
                    }
            }
        return c;
    }
}
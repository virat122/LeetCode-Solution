class Solution {
    public int longestOnes(int[] nums, int k) {

        int ans=0;
        int c=0;
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            
            }
            while(c>k){
                j++;
                if(nums[j]==0){
                    c--;
                }
              
            }

            ans=Math.max(ans, i-j);
        }
        return ans;
        
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int pre[]=new int [nums.length];
        pre[0]=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]+pre[i-1];
            sum+=nums[i];

        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(0==sum-pre[i])return 0;
            }else if(i==nums.length-1){
                if(0==pre[i-1]) return i;
            }else{
                if(pre[i-1]==sum-pre[i])return i;
            }
           
        }
        return -1;
    }
}
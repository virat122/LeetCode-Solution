class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if( nums.length==1){
            return nums[0];
        }

        
        for(int i=1;i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
        double K=k;
           double s= (nums[k-1]/K);
        for(int i=k;i<nums.length; i++){

           if(((nums[i]-nums[i-k])/K)>s){
               s=((nums[i]-nums[i-k])/K);
           }
        }

        
        return s;
        
    }
}
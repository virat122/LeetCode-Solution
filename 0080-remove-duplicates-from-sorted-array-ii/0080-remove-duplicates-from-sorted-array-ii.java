class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;

        for(int  n:nums){
            if(i<2 || nums[i-2]<n){
                nums[i++]=n;

            }
        }
        return i;





        // int p=0;
        // for(int i=0;i<nums.length;){
        //     int c=0;
        //     int t=i;
        //     while( t< nums.length  && nums[i]==nums[t]){
        //         c++;
        //         t++;
        //     }
        //     if(c>2)c=2;
        //     while(c-->0){
        //         nums[p++]=nums[i];
        //     }
        //     i=t;



            
        // }
        // return p;


        
    }
}
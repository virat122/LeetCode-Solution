class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preMul[]=new int [nums.length];
        int sufMul[]=new int [nums.length];
        int ans[]=new int [nums.length];

        preMul[0]=nums[0];
        sufMul[nums.length-1]=nums[nums.length-1];

        int j=nums.length-2;


        for(int i=1;i<nums.length;i++){
            preMul[i]=nums[i]*preMul[i-1];
            sufMul[j]=nums[j]*sufMul[j+1];
            j--;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=sufMul[i+1];
            }
            else if(i==nums.length-1){
                ans[i]=preMul[i-1];

            }else{
                ans[i]=sufMul[i+1]*preMul[i-1];
            }
        }
return ans;

       



        

    



        
        
    }
}
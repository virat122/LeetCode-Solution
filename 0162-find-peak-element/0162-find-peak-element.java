class Solution {
    public int findPeakElement(int[] nums) {
        int a=0;


        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                a=i;
                break;
            }
        }
        if(a==0 &&  2<=nums.length){
           // System.out.println(nums[0]+"    "+nums[nums.length-1]);
            if(nums[0]>nums[nums.length-1] ){
                 a=0;
              //   System.out.println("aaskjhdk");
            }
            else
            a=nums.length-1;
        }

        return a;
    }
}
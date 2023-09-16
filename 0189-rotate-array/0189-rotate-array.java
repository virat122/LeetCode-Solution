class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        if(k==nums.length) return  ;
        int arr[]=new int[nums.length];
        int i=0;
        for( int j= nums.length-k;j<nums.length ;j++){
            arr[i++]=nums[j];
           
        }
        for( int j=0;j<nums.length-k ;j++){
           arr[i++]=nums[j];
        }


        for(i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }


        // nums=Arrays.copyOf(arr);
        // for(int j=0;j<)
        
    }
}
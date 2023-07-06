class Solution {
    public int[] sortEvenOdd(int[] nums) {
            int []c1= new int [101];
            int []c2= new int [101];
            
            for(int i=0;i<nums.length;i+=2){
                    c1[nums[i]]++;
            }
            for(int i=1;i<nums.length;i+=2){
                    c2[nums[i]]++;
            }
            int k=0;
            for(int i=0;  i<101; i++){
                   while(c1[i]>0){
                           nums[k]=i;
                           k+=2;
                           c1[i]--;
                   }
                    
            }
            k=1;
              for(int i=100;  i>=0; i--){
                   while(c2[i]>0){
                           nums[k]=i;
                           k+=2;
                           c2[i]--;
                   }
                    
            }
            
            
          return nums;  
            
            
    }
}
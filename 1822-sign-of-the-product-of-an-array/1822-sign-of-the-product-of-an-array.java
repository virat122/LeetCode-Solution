class Solution {
    public int arraySign(int[] nums) {
            int c=0;
            int z=0;
            for(int i:nums){
                    if(i==0)return 0;
                    if(i<0)c++;
            }
            if(c%2==0)return 1;
            else return -1;
        
    }
}
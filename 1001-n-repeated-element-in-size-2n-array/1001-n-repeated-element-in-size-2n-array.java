class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                return i;
            }
        }
        return -1;
        
    }
}
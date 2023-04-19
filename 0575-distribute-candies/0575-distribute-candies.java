class Solution {
    public int distributeCandies(int[] can) {
            
            Set<Integer> set=new HashSet<>();
            for(int i:can){
                    set.add(i);
            }
            int ans=can.length/2 <set.size()?can.length/2:set.size();
            return ans;
            
        
    }
}
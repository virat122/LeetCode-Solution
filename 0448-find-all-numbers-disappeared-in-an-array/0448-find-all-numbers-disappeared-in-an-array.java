class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            
            List<Integer> ans=new ArrayList<Integer>();
            
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
            
            if(set.size()==nums.length)return ans;
           
            
            for(int i=1;i<=nums.length;i++){
                    if(!set.contains(i))ans.add(i);
                    
            }
        return ans;
    }
}
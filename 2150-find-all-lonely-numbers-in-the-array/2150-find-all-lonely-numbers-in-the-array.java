class Solution {
    public List<Integer> findLonely(int[] nums) {
            List<Integer> ans=new ArrayList<>();
            int co[]= new int [1000002];
            for(int i=0;i<nums.length;i++){
                    co[nums[i]]++;
            }
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                            if(co[nums[i]]==1  &&  co[nums[i]+1]==0  )
                            ans.add(nums[i]);
                            
                    }
                   else {
                           if(co[nums[i]]==1 && co[nums[i]+1]==0 &&  co[nums[i]-1]==0  ){
                            ans.add(nums[i]);
                        }
                   }
            }
            return ans;
  
    }
}
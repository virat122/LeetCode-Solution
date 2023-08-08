class Solution {
            List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
    
        helper(nums, 0, new ArrayList<Integer>()) ;
        return list;
    }

    void helper(int[] nums, int start, List<Integer> slate){

        //base
        if (start == nums.length){
            list.add(new ArrayList<>(slate));
             
            return;
        }

         slate.add(nums[start]);
        helper(nums, start+1, slate);
            
           
         slate.remove(slate.size()-1);

        helper(nums, start+1, slate);
            return ;


    }
}
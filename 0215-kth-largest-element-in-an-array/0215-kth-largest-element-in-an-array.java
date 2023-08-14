class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer>ans= new PriorityQueue<Integer>();
        for(int i=0;i<k;i++){
            ans.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(ans.peek()<nums[i]){
                ans.poll();
                ans.add(nums[i]);

            }
        }
        return ans.peek();
       
        
    }
}
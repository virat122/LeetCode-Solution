class KthLargest {
        PriorityQueue<Integer> minh=new   PriorityQueue<>();
        int k;
        
    public KthLargest(int k, int[] nums) {
            this.k=k;
            for(int i=0;i<nums.length;i++){
                    minh.add(nums[i]);
                    if(minh.size()>k){
                            minh.poll();
                    }
            }
  
    }
    
    public int add(int val) {
              minh.add(val);
                    if(minh.size()>k){
                            minh.poll();
                    }
            
        return minh.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
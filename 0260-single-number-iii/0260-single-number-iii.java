class Solution {
    public int[] singleNumber(int[] nums) {
            int ans[]=new int [2];
            HashMap<Integer, Integer> hp = new HashMap<>();
            for(int i=0; i<nums.length;  i++){
                    if(hp.containsKey(nums[i])){
                            hp.put(nums[i],2);
                    }else{
                        hp.put(nums[i],1);    
                    }
                    
            }
            int k=0;
             for (Integer key : hp.keySet()) 
                {
                    // search  for value
                    int val = hp.get(key);
                    if(val==1){
                         ans[k]=key;
                            k++;
                    }
                }
            return ans;


        }
}

class Solution {
    public List<Integer> targetIndices(int[] nums, int t) {

        ArrayList<Integer> ans=new ArrayList<Integer>();
        int s=0,count=0;
            for(int i=0;i<nums.length;i++)
            {
                    if(t==nums[i]){
                            count++;
                    }else if(nums[i]<t){
                            s++;
                    }
            }
            int i=0;
            
            while(i<count){
                 ans.add(s++) ;  
                    i++;
            }
            
        // Arrays.sort(nums);
        // for(int i:nums){
        //     if(i<t) start++;
        //     if(i==t) count++;
        //     if(i>t) break;            
        // }
        // for(int i=0;i<count;i++){
        //     ans.add(start++);
        // }
        return ans;





        // Arrays.sort(nums);
        // ArrayList<Integer> a=new ArrayList<Integer>();
        // Collections.addAll(a, Arrays.stream(nums).boxed().toArray(Integer[]::new));
        
        // int idx=a.indexOf(t);
        // if(idx==-1){
             
        //      return ans;
        // }
        // while(t==a.get(idx) ){
        //     ans.add(idx);
        //     if(idx==nums.length-1) break;
        //     idx++;
        // }
        // return ans;
       
    }
}
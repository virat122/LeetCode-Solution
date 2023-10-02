class Solution {





     List<List<Integer>> res= new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            //dulpicate a
            if(i==0 || nums[i-1]!=nums[i]){
            twoSumSorted(i+1,nums.length-1,nums,0-nums[i]);
        }
        }
        return res;
    }
    void twoSumSorted(int i,int j,int nums[],int target){
        int a1=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                List<Integer> list=new ArrayList();
                list.add(a1);list.add(nums[i]);list.add(nums[j]);
                res.add(list);

                //dulpicate b
                while(i<j && nums[i]==nums[i+1])
                i++;
                while(i<j && nums[j]==nums[j-1])j--;
                i++;j--;
            }
        }
    
}
    

    // public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> res  = new HashSet<>();
    //     if(nums.length==0) return new ArrayList<>(res);
    //     Arrays.sort(nums);
    //     for(int i=0; i<nums.length-2;i++){
    //         int j =i+1;
    //        int  k = nums.length-1;
    //         while(j<k){
    //             int sum = nums[i]+nums[j]+nums[k];
    //             if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
    //             else if (sum >0) k--;
    //             else if (sum<0) j++;
    //         }

    //     }
    //     return new ArrayList<>(res); 
        
    // }

    // public  List<Integer> twoSum (Set<Integer> set,int[] nums ,int t,int i,int j) {
    //     while(i<j){
    //         if(nums[i]+nums[j]<t) i++;
    //         else if( nums[i]+nums[j]>t) j--;
    //         else{

    //             set.add(Arrays.asList(nums[i],nums[j],t));
    //             //  List<Integer> te=new ArrayList<>();
    //             //         te.add(nums[i]);
    //             //          te.add(nums[j]);
    //             //           te.add(t);
    //                     //  Collections.sort(te);
    //                     //  if(!lst.contains(te))
    //                     //  lst.add(te);

    //             while(i<j && nums[i]==nums[i++])i++;
    //              while(i<j && nums[j]==nums[i-1])j--;
    //         }
    //     }
    //     return set;

    // }


     public List<List<Integer>> TLEe(int[] nums) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();

        for(int i=0;i<nums.length;i++ )
        {
            for(int j=0;j<nums.length && j!=i;j++ ){

                for(int k=0;k<nums.length &&k!=j && k!=i ;k++ ){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> t=new ArrayList<>();
                        t.add(nums[i]);
                         t.add(nums[j]);
                          t.add(nums[k]);
                         Collections.sort(t);
                         if(!lst.contains(t))
                          lst.add(t);
                    }
                }
            }
        }
        return lst;      
    }
}
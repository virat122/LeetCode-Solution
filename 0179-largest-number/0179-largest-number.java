class Solution {
         public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        List<String> arr = new ArrayList();
        for(int i=0; i< nums.length; i++){
            arr.add(String.valueOf(nums[i]));
        }
        Collections.sort(arr, (a,b) ->  {
            return (b+a).compareTo(a+b);
        });
        for(int i=0;i<arr.size();i++){
           sb.append(arr.get(i));
        }


return (sb.charAt(0)=='0') ?  "0" : String.valueOf(sb);
    }
        
        
        
    public String largestNum(int[] nums) {
        String s="";
        for(int i=0;i<nums.length-1;i++){
            int max=i;

            for(int j=i+1;j<nums.length;j++){
               String s1=nums[max]+""+nums[j];
               String s2=nums[j]+""+nums[max];
               if(Double.valueOf(s1)<Double.valueOf(s2)){
                   max=j;
               }
            }
            if(max!=i){
                int t=nums[i];
                nums[i]=nums[max];
                nums[max]=t;
            }
            s+=nums[i];
        }
            
       s+=nums[nums.length-1];
            if(s.charAt(0)=='0'){
                    return "0";
            }
              return s;
        
    }
}
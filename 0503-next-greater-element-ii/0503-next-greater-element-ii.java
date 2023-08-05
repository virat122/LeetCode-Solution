class Solution {
    public int[] nextGreaterElements(int[] nums) {
            int max=Integer.MIN_VALUE;
        
            int []ans=new int [nums.length];
            Stack<Integer> st=new Stack<>();
            int n=nums.length ;
            
            for(int i=(2*n)-1 ; i >=0 ; i--){
                    
                    while(!st.isEmpty() && st.peek()<=nums[i%n]  ){
                            st.pop();
                    }
                    if(!st.isEmpty() && st.peek()>nums[i%n]){
                           
                            if(i<n){
                                    ans[i]=st.peek();
                            }
                             st.push(nums[i%n]);
                            
                    }
                    if(st.isEmpty() ){
                              st.push(nums[i%n]);
                             if(i<n){
                                    ans[i]=-1;
                            }
                            
                    }
                    
                    
                    
                    
            }
            
            
            
           
            
            return ans;
    }
}
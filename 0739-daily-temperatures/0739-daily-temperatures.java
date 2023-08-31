class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int ans[]=new int [n];
        int k=n-1;
        ans[k]=0;
        // k--;


        Stack<Integer> st=new Stack<>();
        int i=n-1;
        while(i>=0){

            if(!st.isEmpty()){
                while(  !st.isEmpty() && temp[i] >=temp[st.peek()]){
                    st.pop();

                }
                if(st.isEmpty()){
                    ans[k--]=0;
                }else{
                    ans[k--]=st.peek()-i;
                }
                st.add(i);

            }else{
                ans[k--]=0;
                st.add(i);
            }
            i--;
         
        }
        return ans;

        
    }
}
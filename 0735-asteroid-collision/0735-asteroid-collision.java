class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<as.length; i++){
            int p=as[i];

            while(!st.isEmpty() && p<0 && st.peek()>0){

                int sum=p+st.peek();
                if(sum<0){
                    st.pop();

                }else if(sum==0){
                    st.pop();
                    p=0; 
                    break;
                }else{
                      p=0; 
                    break;

                }
            }
            if(p!=0)st.add(p);
            
             
            

        }
        int ans[]=new int [st.size()];
        int j=st.size()-1;
        while(!st.isEmpty()){
            ans[j--]=st.pop();
        }
        return ans;

        

        
    }
}
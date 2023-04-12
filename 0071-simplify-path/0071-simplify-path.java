class Solution {
    public String simplifyPath(String path) {
            String []s=path.split("/+");
            
            Stack<String> st=new Stack<>();
            int i=0;
            while(i<s.length){
                    
                    
                    if(s[i].equals("..")){
                            if(!st.isEmpty()){
                                    st.pop();
                            }
                    }else if(!s[i].equals(".")){
                            st.push(s[i]);
                    }
                    i++;
            }
            
            String ans="/";  
            
            if(!st.isEmpty())
                   ans= "/"+st.pop();
            while(!st.isEmpty()){
                    ans="/"+st.pop()+ans;           
                    
            }
            ans=ans.replace("//","/");
                    
            
            
            return ans;
           // return Arrays.toString(s);
    }
        
}
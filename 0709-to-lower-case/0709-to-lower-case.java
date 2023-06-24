class Solution {
    public String toLowerCase(String s) {
           
            String ans="";
            
            for(int i=0;i<s.length();i++){
                      int p=s.charAt(i);
                    if(p<65 || p>90){
                            ans+=s.charAt(i);
                    }else{
                          
                            
                            p=(p+32);
                            ans+=(char)p;
                    }
            }
            return ans;
        
    }
}
class Solution {
    public String countAndSay(int n) {
            String s="1";
            for(int i=2;i<=n;i++){
                    s=soln(s);
                  
            }
            return s;
            
            
        
    }
        public String soln(String s){
                String ans="";
                int i=1;
                int c=1;
                while(i<s.length()){
                        if(s.charAt(i-1)==s.charAt(i))c++;
                        else{
                                ans+=c;
                               ans+=s.charAt(i-1); 
                                c=1;
                        }
                        i++;
                      
                }
                ans+=c;
                ans+=s.charAt(s.length()-1);
                return ans;
                
                
                
        }
        
}
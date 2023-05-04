class Solution {
    public String countAndSay(int n) {
            String s="1";
            for(int i=2;i<=n;i++){
                    s=soln(s);
                 //   System.out.println(s);
                  
            }
            return s;
            
            
        
    }
        public String soln(String s){
                StringBuilder ans=new StringBuilder("");
                int i=1;
                int c=1;
                int n=s.length();
              while(i<n){
                        if(s.charAt(i-1)==s.charAt(i))c++;
                        else{
                                ans.append(c);
                                ans.append(s.charAt(i-1));
                              
                                c=1;
                        }
                        i++;
                      
                }
                  ans.append(c);
                  ans.append(s.charAt(n-1));
              
                return ans.toString();
                
                
                
        }
        
}
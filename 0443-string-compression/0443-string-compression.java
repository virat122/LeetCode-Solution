class Solution {
    public int compress(char[] ch) {
        StringBuilder ans=new StringBuilder("");
            
             int c=1;
            
        for(int i=1;i<ch.length;i++){
                if(ch[i-1]==ch[i]){
                        c++;
                }else{
                        if(c>=2){
                                ans.append(ch[i-1]);
                                
                                String p=String.valueOf(c);
                                ans.append(p) ;

                                c=1;         
                        }else{
                               ans.append(ch[i-1]);
                                //ans.append(c) ;
                                c=1;        
                        }
                }
         
        }
            ans.append(ch[ch.length-1]);
            if(c>1)
            ans.append(c) ;
                                    //        System.out.println(ans);
            
            for(int i = 0 ; i < ans.length(); i++){
               ch[i] = ans.charAt(i);
              }
        return ans.length();
        
    }
}
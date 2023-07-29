class Solution {
    public String shiftingLetters(String s, int[] sh) {
            if(sh.length<=0)return s;
            sh[sh.length-1]=sh[sh.length-1]%26;
           for(int i=sh.length-2;i>=0;i--){
                    sh[i]=(sh[i+1]+sh[i])%26;
                   
            }
            int i=0;
           String ans="";
            for(int j=0;j<s.length();j++){
                    char c=s.charAt(j);
                    int t=c-97;
                    t+=sh[i++];
                    t%=26;
                    t+=97;
                    ans+=(char)(t);
                            
                            
                    
            }
            
           return ans; 
        
    }
}
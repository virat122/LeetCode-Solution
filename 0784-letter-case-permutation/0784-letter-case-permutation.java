class Solution {
        
    public List<String> letterCasePermutation(String s) {
            List<String> ans=new ArrayList<>();
            soln(s,ans,0,"");
            return ans;
            
            
            
        
    }
    public void soln(String s,List<String> ans,int i,String cur) {
            if(i==s.length()){
                     ans.add(cur);
                    return;
            }
            
            if(cur.length()==s.length()){
                   
                    return ;
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    soln(s,ans,i+1,cur+s.charAt(i));
            }else{
                     soln(s,ans,i+1,cur+s.charAt(i));
                     soln(s,ans,i+1,cur+togle(s.charAt(i)));
            }
            
          
            
            
            
            
        
    }
    public char togle(char c) {
          if(c<='z' && c>='a'){
                  return  Character.toUpperCase(c);
          }else{
                  return Character.toLowerCase(c);
          }
    }
        
}
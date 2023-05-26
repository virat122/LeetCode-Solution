class Solution {
    public int appendCharacters(String s, String t) {
         
        if(t.length()==0)return 0;
        int i=0,j=0;
            int c=0;
       while(i<t.length() && j<s.length()){
           if(i==t.length()-1 && s.charAt(j)==t.charAt(i))return c;

           if(s.charAt(j)==t.charAt(i)){
               i++;
               j++;
           }else{
               j++;
           }

       }
            c=t.length()-i;
        

    return c;
        
        
    }
}
        

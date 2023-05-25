class Solution {
    public int longestPalindrome(String s) {
            Map <Character,Integer> hm=new HashMap<>();
            
            for(int i=0;i<s.length();i++){
                    if( !hm.containsKey(s.charAt(i))){
                            hm.put(s.charAt(i),1);
                    }else{
                            int p=hm.get((s.charAt(i)));
                             hm.put(s.charAt(i),p+1);
                            
                    }
         
            }
                                         
                                         int c=0;
                                         boolean odd=false;
                                        
             for (Integer val : hm.values()) {
                     if(!odd){
                             if(val%2==1)odd=true;
                     }
                     c+=(val/2);
                     
  
                 }
            if(odd){
                    return c*2+1;
            }
                                         return c*2;
            
            
            
        
    }
}
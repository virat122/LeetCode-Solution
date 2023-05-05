class Solution {
    public int maxVowels(String s, int k) {
            String vob="aeiou";
            int c=0;
            int max=0;
            for(int i=0;i<k;i++){
                    if(vob.contains(String.valueOf(s.charAt(i))))c++;
                    if(c==k){
                            return c;
                    }    
                    if(max<c){
                            max=c;
                    }
            }
            int j=k,i=0;;
            while(j<s.length()){
                    if(vob.contains(String.valueOf(s.charAt(i))))c--;
                    if(vob.contains(String.valueOf(s.charAt(j))))c++;
                      if(max<c){
                            max=c;
                    }
                    i++;
                    j++;
            }
            return max;
            
            
            
            
        
    }
}
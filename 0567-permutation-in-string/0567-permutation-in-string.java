class Solution {
    public boolean checkInclusion(String s1, String s2) {
            if(s2.length()<s1.length())return false;
            
            int a[]=new int[26];
            int b[]=new int[26];
            
            for(int i=0;i<s1.length();i++){
                    a[s1.charAt(i)-'a']++;
                    b[s2.charAt(i)-'a']++;
            }
            
            int i=0,j=s1.length();
            
            while(j<= s2.length()){
                    if(isequal(a,b)){
                            return true;
                    }
                    if(j==s2.length())break;
                    b[s2.charAt(i)-'a']--;
                    b[s2.charAt(j)-'a']++;
                    i++;
                    j++;
                    
            }
            return false;
            
        
    }
       boolean isequal(int a[],int b[]){
               for(int i=0;i<26;i++){
                       if(a[i]!=b[i])return false;
               }
               return true;
       }
}
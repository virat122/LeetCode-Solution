class Solution {
    public int lengthOfLongestSubstring(String s) { 
        int max=0;
        int m=0;;
        for(int i=0;i<s.length();i++){
            Set<Character> st = new HashSet<Character>();
            m=0;
            for(int j=i;j<s.length();j++){    
                if(st.add(s.charAt(j))){
                    m++;
                }
                else {
                    if(m>max){
                        max=m;
                        break;
                    }
                break;
                }
                if(j+1==s.length() && m > max){
                     max=m;        
                }   
            }   
        }
        return max>m ?max: m;    
    }
}
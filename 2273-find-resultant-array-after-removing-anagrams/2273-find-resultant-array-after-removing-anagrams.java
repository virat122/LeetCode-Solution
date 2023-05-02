class Solution {
    public List<String> removeAnagrams(String[] words) {
            
               List<String> ans=new ArrayList<>();
            
           Stack<String> st=new Stack<>();
             char t[]=words[0].toCharArray();
             Arrays.sort(t);
             String k=Arrays.toString(t);
            st.add(k);     
            ans.add(words[0]);
            for(int i=1;i<words.length;i++){
                    t=words[i].toCharArray();
                    Arrays.sort(t);
                    k=Arrays.toString(t);
                    
                    
                    if(!st.peek().equals(k)){
                            ans.add(words[i]);
                            st.add(k);
                    }
            }
            st.clear();
            return ans;
        
        
    }
}
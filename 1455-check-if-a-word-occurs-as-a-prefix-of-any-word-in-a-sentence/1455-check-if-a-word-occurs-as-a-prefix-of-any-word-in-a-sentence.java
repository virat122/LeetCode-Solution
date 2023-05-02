class Solution {
    public int isPrefixOfWord(String sen, String pre) {
            String []s=sen.split(" ");
            
            for(int i=0;i<s.length;i++){
                    if(s[i].startsWith(pre)){
                            return i+1;
                    }
            }
            return -1;
        
    }
}
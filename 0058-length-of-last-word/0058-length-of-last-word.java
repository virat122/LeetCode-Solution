class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        String []ans= s.split("\\s+");
        String p=ans[ans.length-1];
        return p.length();
        
        
    }
}
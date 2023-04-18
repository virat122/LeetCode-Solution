class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        String s="";
        int i=0 ,j=0;
        while( i < word1.length() && j< word2.length() ){
            s+=word1.charAt(i++)+""+word2.charAt(j++);
        }

        while( i < word1.length() ){
            s+=word1.charAt(i++);
        }
        while( j < word2.length() ){
            s+=word2.charAt(j++);
        }
        return s;

    }
}
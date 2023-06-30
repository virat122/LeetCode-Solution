class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0, small = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
                small++;
            else
                capital++;
        }
        if((capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) || capital == word.length() || word.length() == 1 || capital == 0)
            return true;
        return false;
    }
}

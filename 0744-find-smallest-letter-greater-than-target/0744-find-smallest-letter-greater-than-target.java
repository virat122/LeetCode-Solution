class Solution {
    public char nextGreatestLetter(char[] let, char t) {
            for(int i=0;  i<let.length;  i++){
                    if(let[i]>t)return let[i];
                    
            }
            return let[0];
        
    }
}
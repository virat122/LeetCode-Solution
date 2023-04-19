class Solution {
    public boolean checkIfPangram(String s) {
            
            for(char i='a';i<='z';i++){
                    
                    if(!s.contains(String.valueOf(i)))
                            return false;
            }
            return true;
        
    }
}
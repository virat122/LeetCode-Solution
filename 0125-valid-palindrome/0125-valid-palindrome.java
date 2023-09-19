class Solution {
    public boolean isPalindrome(String s) {
        char []string=new char[s.length()];
        int idx=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)   
        {
            if( Character.isAlphabetic(s.charAt(i))||  Character.isDigit(s.charAt(i))){

                string[idx]=s.charAt(i);
                idx++;
            }
        }
        System.out.println(Arrays.toString(string));
        int i=0,j=idx-1;
        while(i<=j){
            if(string[i++]!=string[j--])return false;
        }
        return true;
        
    }
}
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (i==(s.length()-1)){
                sum+=value(s.charAt(i));
            }
            else if(value(s.charAt(i))<value(s.charAt(i+1))){
                int p=value(s.charAt(i+1))-value(s.charAt(i));
                sum+=p; 
                 i++;                
            }
            else{
                sum+=value(s.charAt(i));
            }        
        }
        return sum;
        
    }
    public static int value(char s){
        switch(s){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;                         
        }
        return 0;
    }
}
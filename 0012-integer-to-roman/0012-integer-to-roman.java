class Solution {
    public String intToRoman(int num) {
        int n=num;
       int[] array = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
        String[] str = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String t="";
        for(int i=0;i<array.length;i++)
            while(n >= array[i])
            {
                t += str[i]; 
                n -= array[i];
            }
        return t;
        
       
        
    }
    
    
    //  public static char value(int s){
    //     switch(s){
    //         case s>=1000:
    //             return "M";
    //         case s>=500:
    //             return 'D';
    //         case s>=100:
    //             return 'C';
    //         case s>=50:
    //             return 'L';
    //         case s>=10:
    //             return 'X';
    //         case s>=5:
    //             return 'V';
    //         case s>=1:
    //             return 'I';                         
    //     }
    //     return 'c';
    // }
}
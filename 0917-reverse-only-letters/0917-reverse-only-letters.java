class Solution {
//         public boolean isAlpha(char c){
//                 c=Character.toLowerCase(c);
//                 if(c>='a' && c<='z')return true;
//                 return false;
                
//         }
   public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetter(s.charAt(j))){
                j--;
            }
            char ch=arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;j--;
        }
        s=String.valueOf(arr);
        return s;
    }
        
}
class Solution {
    public String reverseVowels(String str) {
        List <Character> v=new ArrayList<>();
      v.add('a');
      v.add('e');
      v.add('i');
      v.add('o');
      v.add('u');
     v.add('A');
      v.add('E');
      v.add('I');
      v.add('O');
      v.add('U');
        int i=0;
     
        StringBuilder s=new StringBuilder (str);
           int  j=s.length()-1;
        while(i<=j){
            
            if(v.contains(s.charAt(i)) && v.contains(s.charAt(j))){
                char t=s.charAt(i);
                char p=s.charAt(j);
                s.setCharAt(i,p);
                 s.setCharAt(j,t);
                
               i++;
                j--;
            }else if(v.contains(s.charAt(i))){
                j--;
            }else{
                i++;
            }
        }
        return s.toString();
        
    }
}
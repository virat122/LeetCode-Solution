class Solution {
    public String removeStars(String s) {

        //  StringBuilder  s1 =new StringBuilder();
        //  for(int i=0;i<s.length();i++){
        //      if(s.charAt(i)=='*'){
        //          if(s1.length()>0){
        //              s1.deleteCharAt(s1.length()-1);
        //          }
        //      }else{
        //          s1.append(s.charAt(i));
        //      }
        //  }  
        //   return s1.toString();  


         Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') stack.pop();
            else stack.push(s.charAt(i));
        }

        char[] ans = new char[stack.size()];
        int j = ans.length - 1;
        while (!stack.isEmpty())
            ans[j--] = stack.pop();
        return new String(ans);
    }
}

 
         

    //       for(int i=0;i<t.length();i++){
    //           if(t.charAt(i)=='#'){
    //               if(t1.length()>0){
    //                   t1.deleteCharAt(t1.length()-1);
    //               }
    //           }else{
    //               t1.append(t.charAt(i));
    //           }
    //       }
          
    //       return s1.toString().equals(t1.toString());  
    // }
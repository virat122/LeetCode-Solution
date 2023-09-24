class Solution {
    public String decodeString(String s) {
        Stack<Integer>dig=new Stack<>();
        Stack<String>str=new Stack<>();
        String curstr="";
        int curnum=0;

        for(char c:s.toCharArray()){
            if(isDigit(c)){
                curnum=curnum*10+c-'0';
            }else if(c=='['){
                str.add(curstr);
                dig.add(curnum);
                curnum=0;
                curstr="";
            }else if(c==']'){
                String prestr=str.pop();
                int count =dig.pop();
                String temp="";
                while(count-->0){
                    temp+=curstr;
                }
               curstr= prestr+temp;
            }else{
                curstr+=c;

            }

            


        }

         
        return curstr;


        
    }
    public boolean isDigit (char c){
        if(c<='9' && c>='0')return true;
        return false;
    }

}
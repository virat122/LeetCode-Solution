class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        String[]ans=new String [n];
        Arrays.fill(ans,"");
        
        boolean f=false;
        int p=0;
        for(int i=0;i<s.length();i++){
            if( !f  && p< n){
                ans[p]+=s.charAt(i);
                p++;
               // System.out.println(s.charAt(i)+"  "+ p);
                if(p==n){
                     f=true;
                     p-=2;
                }
            }else if( f &&  p>=0){
                ans[p]+=s.charAt(i);
               //  System.out.println(s.charAt(i)+"  "+ p);
                p--;
                if(p==-1 ){
                 f=false;
                 p+=2;
                }
            } 

        }
        String ret="";
        for(String t: ans){
            ret+=t;

        }
        return ret;


    }
}
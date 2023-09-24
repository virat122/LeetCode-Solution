class Solution {
    public String longestCommonPrefix(String[] st) {
        int p=0;
        String s=st[0];
        for(int i=0;i<st[0].length();i++){
            boolean f=false;
            for(int j=1;j<st.length;j++){
                if( i==st[j].length()||s.charAt(i)!=st[j].charAt(i)){
                    f=true;
                    break;
                }
            }
            if(f){
                p=i;
                break;
            }p++;
        }
        if (st.length<=1) return st[0];
        return st[0].substring(0,p);


        
        
    }
}
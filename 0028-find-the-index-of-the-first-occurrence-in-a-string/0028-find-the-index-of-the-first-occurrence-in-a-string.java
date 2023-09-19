class Solution {
    public int strStr(String h, String n) {

        // /int p=h.indexOf(n);
        // return p;

        if(n.length()==0)return 0;
        if(h.length()==0)return -1;
        for(int i=0;i<h.length();i++){

            if(i+n.length()>h.length())break;

            for(int j=0;j<n.length();j++){
                if(n.charAt(j)!=h.charAt(i+j)){
                    break;
                }
                if(j==n.length()-1)return i;
            }

        }
        return -1;
        
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        int ans;
        char[]s1 =s.toCharArray();
        char[]t1 =t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i=0;

        for(char c:s1){
            if(t1[i++]!=c)return t1[i-1];

        }
        return t1[i];

     
    }
}
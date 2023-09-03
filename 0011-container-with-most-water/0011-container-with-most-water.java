class Solution {
    public int maxArea(int[] h) {
       int strt=0;
        int end=h.length-1;
        int max=0;
        int cur =0;
        while (strt<end){
            int lmt=Math.min(h[strt],h[end]);
            cur=lmt * (end-strt);
           // System.out.println(lmt +"    cur  "+cur);
            if(cur>max){
                max=cur;
            }
            if(h[strt]< h[end]){
                strt++;
            }else{
                end--;
            }

        }
       // System.out.println(max);
        return max;
        
    }
}
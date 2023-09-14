class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int rw=0;
        int cl=mat[0].length-1;
        while(rw<mat.length && cl>=0 ){
            if(mat[rw][cl]==t){
                return true;
            }else if(mat[rw][cl]<t){
                rw++;
            }else{
                cl--;
            }         
        }
       return false;    
    }
}
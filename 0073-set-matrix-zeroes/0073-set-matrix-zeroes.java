class Solution {
    public void setZeroes(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>(); 
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(m[i][j]==0){
                   row.add(i);
                   col.add(j);
               }
           }
       }
       for(int p:row){
            for(int i=0;i<c; i++){
                m[p][i]=0;
            }
          // zerorow(m,i);
       }
       for(int p:col){

           for(int i=0;i<m.length;i++){
              m[i][p]=0;
           }
          // zerocol(m,i);
       }
     
    }
    // // public void zerocol(int[][] m,int r){
    // //     for(int i=0;i<m.length; i++){
    // //         m[r][i]=0;
    // //     }
    // // }

    //  public void zero(int[][] m,int c){
    //     for(int i=0;i<m.length;i++){
    //         m[i][c]=0;
    //     }
    // }
}
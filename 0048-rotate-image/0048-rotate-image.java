class Solution {
    public void rotate(int[][] mat) {

        int n=mat.length;
        int p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=p;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
            p++;
        }
        
         for(int i=0;i<n;i++){
             int l=0,h=n-1;
             while(l<h){
                  int t=mat[i][l];
                mat[i][l]=mat[i][h];
                mat[i][h]=t;
                l++;h--;
             }
           
            // System.out.print("\n");
         }

    }

    // int arr[][]=new int [mat.length][mat[0].length];

    //     int p=mat.length-1;
    //     int q=mat[0].length-1;

    //     for(int i=0;i<mat.length;i++){
    //         q=mat[0].length-1;
    //         for(int j=0;j<mat.length && q>=0;q--,j++){
    //            arr[i][j]=mat[q][i];
    //         }
    //     } 
    //      for(int i=0;i<mat.length;i++){
    //         for(int j=0;j<mat.length;j++){
    //            mat[i][j]=arr[i][j];
    //         }
    //      }
  
    // }

    // public void solution(int[][] mat){
    //     int arr[][]=new int [mat.length][mat[0].length];

    //     int p=mat.length-1;
    //     int q=mat[0].length-1;

    //     for(int i=0;i<mat.length;i++){
    //         q=mat[0].length-1;
    //         for(int j=0;j<mat.length && q>=0;q--,j++){
    //            arr[i][j]=mat[q][i];
    //         }
    //     } 
    //      for(int i=0;i<mat.length;i++){
    //         for(int j=0;j<mat.length;j++){
    //            mat[i][j]=arr[i][j];
    //         }
    //      }
    // }
}
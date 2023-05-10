class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr=new int[n][n];
        return Matrix(arr,0,0,n,1);
        
    }

    public int[][] Matrix( int[][] ar ,int a,int b, int n ,int s){

        if(a==n-1 && b==n-1){
            ar[a][b]=s;
            return ar;
        }
        if(a>n-1 && b>n-1){
            return ar;

        }
    
        for(int i=b;i< n;i++){
            ar[a][i]=s++;       
        }
        for(int i=a+1;i< n;i++){
            ar[i][n-1]=s++;       
        }
        for(int i=n-2;i>=b;i--){
            ar[n-1][i]=s++;       
        }
        for(int i=n-2;i>a;i--){
            ar[i][a]=s++;       
        }

        return  Matrix(ar,a+1,b+1,--n,s);
        
    }



}
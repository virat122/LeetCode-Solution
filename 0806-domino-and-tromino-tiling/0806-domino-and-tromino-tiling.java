class Solution {
    public int numTilings(int n) {
        int  arr[]=new int [n+3];
        arr[1]=1;
        arr[2]=2;
        arr[3]=5;

        for(int i=4;i<=n;i++){
            arr[i]=(2*arr[i-1] %1000000007+arr[i-3] )%1000000007;

        }

     
        
        return arr[n];
        
    }

    public long nTilings(int n,long []arr) {
         if(n<4){
             return arr[n];
         }
        if(arr[n]!=0)return arr[n];
       



         arr[n]=(2*nTilings(n-1,arr)+nTilings(n-3,arr))%1000000007;
         return arr[n];
        
    }
    //  public long  memorizationnTilings(int n,long []arr) {
    //      if(n<4){
    //          return arr[n];
    //      }
    //     if(arr[n]!=0)return arr[n];
       



    //      arr[n]=(2*nTilings(n-1,arr)+nTilings(n-3,arr))%1000000007;
    //      return arr[n];
        
    // }
}
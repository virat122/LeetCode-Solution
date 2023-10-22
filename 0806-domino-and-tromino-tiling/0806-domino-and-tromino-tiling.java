class Solution {
    public int numTilings(int n) {
        long arr[]=new long [n+3];
        arr[1]=1;
        arr[2]=2;
        arr[3]=5;
        if(n<4)return (int )arr[n];
        
        return (int)nTilings(n,arr);
        
    }
     public long nTilings(int n,long []arr) {
         if(n<4){
             return arr[n];
         }
        if(arr[n]!=0)return arr[n];
       



         arr[n]=(2*nTilings(n-1,arr)+nTilings(n-3,arr))%1000000007;
         return arr[n];
        
    }
}
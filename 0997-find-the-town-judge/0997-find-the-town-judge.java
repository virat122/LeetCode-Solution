class Solution {
    public int findJudge(int n, int[][] trust) {
        int []trsti=new int [n+1];
        int []trsted=new int [n+1];

        for(int i=0;i<trust.length;i++ ){
           trsti[trust[i][0]]++;  
           trsted[trust[i][1]]++;           
        }     

        for(int i=1;i<=n;i++){
            if(trsted[i]==n-1 && trsti[i]==0){
                return i;
            }

        }  
        return -1;
    }
}
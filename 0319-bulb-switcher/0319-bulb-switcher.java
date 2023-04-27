class Solution {
    public int bulbSwitch(int n) {
            
            double d=Math.sqrt(n);
            return (int)(d);
            
            
            
//             boolean b[] =new boolean[n+1];
//             for(int i=1;i<=n;i++){
//                    int j=i;
//                     while(j<=n){
//                          if(b[j]==true)              
//                                  b[j]=false;
//                             else
//                                   b[j]=true;                                   
//                             j+=i;                                   
//                     }                                     
//             }
//             int c=0;
//             for(int i=1;i<=n;i++){
//                     if(b[i])c++;                    
//             }
//             return c;
    }
}
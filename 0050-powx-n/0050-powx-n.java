class Solution {
    public double myPow(double x, int n) {
        
       return Math.pow(x,n) ;

      
    }
}



// double ans=1;
//         if (n<0){
//             for(int i=n*-1;i>0;i--){
//                 ans=ans*x;
//             }
//             return 1/ans;
//         }else{
//             for(int i=0;i<n;i++){
//                 ans=ans*x;
//             }
//             return ans;
//         }
class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int leftbound[]=new int[h.length];
        int rightbound[]=new int[h.length];

        for(int i=0;i<n;i++){
            leftbound[i]= i==0?h[i]: Math.max(h[i],leftbound[i-1]);
        }
        for(int i=n-1 ;i>=0;i--){
           rightbound[i]= i==n-1? h[i]: Math.max(h[i],rightbound[i+1]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int lmt=Math.min(leftbound[i],rightbound[i]);


            sum+=(lmt*1)-h[i];
            
        }
        return sum;


        
        
    }
}
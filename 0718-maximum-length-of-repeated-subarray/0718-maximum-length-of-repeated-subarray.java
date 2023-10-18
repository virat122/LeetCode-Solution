class Solution {
    public int findLength(int[] n1, int[] n2) {

        int max=0;
        for(int i=0;i<n1.length;i++){
            
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    int t=1;
                    int p=i+1,q=j+1;
                    while( p< n1.length && q<n2.length && n1[p]==n2[q]){
                        p++;q++;
                        t++;

                    }
                    if(max<t)max=t;
                    

                }
            }
        }
        return max;

        
    }
}
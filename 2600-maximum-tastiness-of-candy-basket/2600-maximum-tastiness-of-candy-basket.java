class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l=0;
        int r=price[price.length-1]-price[0];
        int max=0;
                // System.out.println(Arrays.toString(price));

        while(l<=r){
            int mid=(l+r)/2;
            if( isPossible(price,k,mid)){
                max=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }

        }
        return max;
        
    }
    public boolean  isPossible(int[] p, int k,int dif) {
        int l=1;
        int pre=0;
        for(int i=1;i<p.length;i++){
            if(dif<=p[i]-p[pre]){
                // System.out.print(p[i]+"  ");
                l++;
                pre=i;
            }
            if(l>=k)return true;
        }
        // System.out.println();

        if(l>=k)return true;
        return false;

        
    }

}
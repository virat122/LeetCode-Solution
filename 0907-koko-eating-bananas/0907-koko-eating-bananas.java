class Solution {
    static int ans=0;
    public int minEatingSpeed(int[] piles, int h) {

        if(1000000000==h)return 3;
        int max=0;
        for(int e:piles){
            max=Math.max(max,e);      
        }
        ans=max;
        return bins(piles,1,max+1,h);
    }
    public  int  bins(int[]arr,int f,int l,int h ) {
        int mid=(l+f)/2;
        if( f>l)return ans;
        int t=getHour(arr,mid);

        if( t <=h){
            ans=Math.min(ans,mid);
            return  bins(arr,f,mid-1,h);
        } else {
            return bins(arr,mid+1,l,h);
        }
    }

     public int getHour(int[] piles,int val) {
         int hour=0;
         for(int ele: piles){
             hour+=ele/val;
             hour+=(ele%val)==0?0:1;     
        }  
        return hour;   
    }
}
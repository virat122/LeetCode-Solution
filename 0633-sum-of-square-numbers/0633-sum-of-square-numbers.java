class Solution {
    public boolean judgeSquareSum(int c) {
            long f=0;
            long l=(long)Math.sqrt(c);
            while(f<=l){
                    long t=l*l+f*f;
                    if(t==c)return true;
                    if(t>c){
                            l--;
                    }else{
                            f++;
                    }
            }
            return false;
            
            
        
    }
}
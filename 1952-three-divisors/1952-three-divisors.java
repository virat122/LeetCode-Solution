class Solution {
    public boolean isThree(int n) {
            if ((n<=2|| (Math.floor(Math.sqrt(n))) !=(Math.ceil(Math.sqrt(n)))))return false;
            
            for(int i=2;i<Math.sqrt(n);i++){
                    if(n%i==0)return false;
            }
            
        
        return true;
    }
}
import java.math.*;
class Solution {
    public boolean isPowerOfFour(int n) {
        
        return check(n,1);
        
    }
    public static boolean check(int n,long temp){
       
        if(n==temp)return true;
        if(temp>n) return false;
        
         return check( n, temp*4);
        
        
    }
}
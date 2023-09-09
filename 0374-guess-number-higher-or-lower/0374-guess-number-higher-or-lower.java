/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return check(1,n);
        
    }

    public int check(int s,int l){
        if(s<=l){
            int mid=s+(l-s)/2;
            if( guess(mid)==0){
                return mid;
            }
            else if( guess(mid)==-1){
                return check(s,mid-1);
            }else{
                 return check(mid+1,l);
            }
        }
        return -1;
    }
}
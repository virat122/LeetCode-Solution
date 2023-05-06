//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




class Solution {
    public static String stringMirror(String str) {
        int i;
        for( i=1;i<str.length();i++){
            if(str.charAt(i)>str.charAt(i-1)){
                break;
            }
            if(str.charAt(i)==str.charAt(i-1) &&str.charAt(i)==str.charAt(0))
              break;
        }
        String sub=str.substring(0,i);
        return sub+reverse(sub);
    }
    
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
}
        
        

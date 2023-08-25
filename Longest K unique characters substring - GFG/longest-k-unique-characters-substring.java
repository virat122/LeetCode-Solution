//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        int maxi=-1;
        while(j<s.length()){
            char ch1=s.charAt(j);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            while(map.size()>k){
                char ch2=s.charAt(i);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0) map.remove(ch2);
                i++;
            }
            if(map.size()==k) maxi=Math.max(maxi,j-i+1);
            j++;
        }
        return maxi;
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<N;i++) {
            String s1 = "";
            String str = Dictionary[i];
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    s1 += str.charAt(j);
                }
            }
            if(s1.length() < Pattern.length()) {
                continue;
            }
            if(s1.substring(0, Pattern.length()).compareToIgnoreCase(Pattern) == 0) {
                result.add(str);
            }
        }
        
        if(result.size() == 0) {
            result.add("-1");
        }
        Collections.sort(result);
        return result;
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution {
    String reverseEqn(String S) {
        Deque<String> s1 = new ArrayDeque<>();
        Deque<Character> s2 = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                temp.append(ch);
            } else {
                s1.push(temp.toString());
                temp.setLength(0);
                s2.push(ch);
            }
        }
        s1.push(temp.toString());

        while (!s1.isEmpty()) {
            res.append(s1.pop());
            if (!s2.isEmpty()) {
                res.append(s2.pop());
            }
        }

        return res.toString();
    }
}
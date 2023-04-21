//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    
    {
        
        
        List<String> st1 = Arrays.asList(s1);
        List<String> st2 = Arrays.asList(s2);
        int count = countSuffixPrefix(st1, st2);
        return count;  
        // System.out.println(count); // output: 2
       
    }
    public static int countSuffixPrefix(List<String> s1, List<String> s2) {
        int count = 0;
        for (String str2 : s2) {
            for (String str1 : s1) {
                if (str1.startsWith(str2) || str1.endsWith(str2)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends




class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // if we can get reverse string for all the array elements
        // then palindrome is possible
        HashSet<String> set = new HashSet<>();

        for (String x : arr) {
            set.add(x);
        }

        int c = 0;
        for (String x : set) {
            String rev = new StringBuffer(x).reverse().toString();
            if (set.contains(rev)) {
                c++;
              
                // set.remove(rev);
            }

            
            if (c == arr.length)
                return true;
        }

        return false;
    }
}
           

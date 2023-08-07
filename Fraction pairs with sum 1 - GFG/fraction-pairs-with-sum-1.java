//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
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
            
            
            int[] numerator = IntArray.input(br, n);
            
            
            int[] denominator = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countFractions(n, numerator, denominator);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countFractions(int n, int[] num, int[] deno) {
       HashMap<Double, Integer> hm = new HashMap<>();
       int res = 0;
       for(int i = 0;i<n;i++){
           double a = (num[i]*1.0)/deno[i];
           a = (Math.round(a*1000000000)*1.0)/1000000000;
           if(hm.containsKey((Math.round((1-a)*1000000000)*1.0)/1000000000)){
               res += hm.get((Math.round((1-a)*1000000000)*1.0)/1000000000);
           }
           hm.put(a, hm.getOrDefault(a, 0)+1);
       }
       return res;
    }
}   

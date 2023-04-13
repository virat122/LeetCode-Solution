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
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] color = IntArray.input(br, N);
            
            
            int[] radius = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.finLength(N, color, radius);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int finLength(int N, int[] c, int[] r) {
        
        Stack<Integer>a=new Stack<Integer>();
         Stack<Integer>s=new Stack<Integer>();
         for(int i=0;i<N;i++){
             if(s.isEmpty()){
                
                 a.push(c[i]);
                 s.push(r[i]);
             }else{
                 if(a.peek()==c[i] && s.peek()==r[i]){
                     a.pop();
                     s.pop();
                 }else{
                      a.push(c[i]);
                 s.push(r[i]);
                 }
             }
         }
        
        return s.size();
        // code here
    }
}
        

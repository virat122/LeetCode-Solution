//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];
            
            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);
                
           //calling arrange() function
           new Solution().arrange(arr, n);
           
           //printing the elements 
           for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class Solution {
    static void arrange(long arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[(int) arr[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }
}
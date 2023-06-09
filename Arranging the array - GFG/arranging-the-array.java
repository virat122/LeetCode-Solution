//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution {
    
    public void Rearrange(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Long>lst1 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                lst1.add((long)arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
                lst1.add((long)arr[i]);
        }
        int i=0;
        for(Long l:lst1)
        {
            int a = (int)(l*1);
            arr[i] =a; //(int)(l);
            i++;
        }
    }
}
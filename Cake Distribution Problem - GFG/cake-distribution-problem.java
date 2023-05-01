//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
	int maxSweetness(int [] a, int n, int k) {
	    // Write your code here.
	    int i = 1, j = (int)1e9;
	    int ans = 0;
	    while(i <= j){
	        int mid = (i+j)/2;
	        if(valid(mid, a, k)){
	            ans = mid;
	            i = mid+1;
	        }
	        else    
	            j = mid-1;
	    }
	    return ans;
	}
	boolean valid(int x, int a[], int k){
	    int count = 0, sum = 0;
	    for(int i : a){
	        sum += i;
	        if(sum >= x){
	            count++;
	            sum = 0;
	        }
	    }
	    return count > k;
	}
}
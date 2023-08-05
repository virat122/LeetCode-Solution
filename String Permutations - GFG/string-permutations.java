//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> res = new ArrayList<>();
        solve(res, S.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }
    
    void solve(ArrayList<String> res,char[] str, int start) {
        if( start == str.length) {
            res.add(new String(str));
            return;
        }
        

        for(int i = start; i < str.length; i++) {
            swap(i, start, str);
            solve(res,str , start + 1);
            swap(i, start, str);
            
        }
        
    }
    
    void swap(int from, int to, char[] chars) {
        char temp = chars[from];
        chars[from] = chars[to];
        chars[to] = temp;
    }
	   
}
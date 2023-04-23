//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java




//User function Template for Java


class Solution
{
	int [] nearestSmallestTower(int [] arr)
	{
	    int n = arr.length;
        Stack<Integer> pre = new Stack<>();
        Stack<Integer> suf = new Stack<>();
        int [] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++)
        {
            while (!pre.empty() && arr[pre.peek()] >= arr[i])
            {
                pre.pop();
            }

            if (!pre.empty())
            {
                res[i] = pre.peek();
            }

            pre.push(i);
        }

        for (int i = n - 1; i >= 0; i--)
        {
            while (!suf.empty() && arr[suf.peek()] >= arr[i])
            {
                suf.pop();
            }

            if (!suf.empty())
            {

                if (res[i] != -1)
                {
                    if (Math.abs(res[i] - i) == Math.abs(suf.peek() - i))
                    {
                        if (arr[res[i]] > arr[suf.peek()])
                            res[i] = suf.peek();
                    }
                    else if (Math.abs(res[i] - i) > Math.abs(suf.peek() - i))
                        res[i] = suf.peek();
                }
                else
                    res[i] = suf.peek();
            }

            suf.push(i);
        }

        return res;
	}
}
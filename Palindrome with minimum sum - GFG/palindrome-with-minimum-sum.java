//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            int res = obj.minimumSum(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends




class Solution {
    public static int minimumSum(String s) {
        // code here
        int len = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = len-1;
        
        while(i<=j){
            if(arr[i] >= 'a' && arr[i] <= 'z' && arr[j] == '?')
                arr[j] = arr[i];
            else if(arr[i] == '?' && arr[j] >= 'a' && arr[j] <= 'z')
                arr[i] = arr[j];
            else if(arr[i] != arr[j])
                return -1;
            
            i++;
            j--;
        }
        
        int sum = 0;
        char prev = 'A';
        for(i = 0; i < len/2; i++){
            if(arr[i] != '?'){
                if(prev != 'A')
                    sum += Math.abs(prev - arr[i]);
                prev = arr[i]; 
            }
        }
        return sum*2;
    }
}
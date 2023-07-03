//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends



    
class Solution {

    int maxIndexDiff(int arr[], int n) {
       
        int pre[] = new int[n];
        pre[0] = arr[0];
        for(int i = 1; i<n; i++) pre[i] = Math.min(arr[i] , pre[i-1]);
        int ans = 0;
        
        
        for(int i = 1 ; i<n; i++){
            int l = 0;
            int r = i-1;
            
            while(l<=r){
                int mid =(l+r)>>1;
                if(pre[mid]<=arr[i]) r = mid-1;
                else l = mid+1;
            }
            
            if(l<i) ans = Math.max(ans , i - l );
        }
        return ans;
        
    }
}
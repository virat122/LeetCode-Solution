//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
          ArrayList<Integer>ans=new ArrayList<>();
        ans.add(a[0]);
        for(int i=1;i<size;i++){
            if(ans.get(ans.size()-1)<a[i]){
                ans.add(a[i]);
            }else{
                int c=getAns(ans,a[i]);
                ans.set(c,a[i]);
            }
        }
        return ans.size();
    }
    static int getAns(ArrayList<Integer>a,int x){
        int low=0,high=a.size()-1;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a.get(mid)==x){
                return mid;
            }else if(a.get(mid)<x){
                low=mid+1;
            }else{
                high=mid-1;
                res=mid;
            }
        }
        return res;
    }
} 
//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean getPairsCount(int[] arr, int l,int high, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=l;i<=high;i++){
            if(h.containsKey(k-arr[i])){
                return true;
            }
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
	public boolean findTriplets(int arr[] , int n)
    {
        for(int i=0;i<n;i++){
            if(getPairsCount(arr,i+1,n-1,0-arr[i])){
                return true;
            }
        }
        return false;
    }
} 
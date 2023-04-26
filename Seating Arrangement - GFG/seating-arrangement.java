//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int test = Integer.parseInt(in.readLine().trim());
        while(test-- > 0){
            int n = Integer.parseInt(in.readLine().trim());
            int m = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int [] seats = new int[m];
            for(int i = 0; i < m; i++){
                seats[i] = Integer.parseInt(s[i]);
            }
            Solution obj = new Solution();
            boolean res = obj.is_possible_to_get_seats(n, m, seats);
            
            String _result_val = (res) ? "Yes" : "No";
            out.println(_result_val);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static boolean is_possible_to_get_seats(int m, int n, int[] se) {
        // code here
         int c=0;
        if(n==1 ){
            if( se[0]==0){
                 return m<=1;
            }else{
                return m<=0;
            }
        }
         if(n==2 ){
            if( se[0]==0 && se[1]==0){
                 return m<=1;
            }else{
                return m<=0;
            }
        }
       
        
        
         
       
        for(int i=0;i<n;i++){
            if(i==0 ){
                if( se[i+1]==0&&se[i]==0){
                  c++;
                se[i]=1;
                i++;  
                }
            }
            else if(i==n-1 ){
                if(se[i-1]==0&&se[i]==0 ){
                  c++;
                i++;   
                }
               
            }
             else{
                  if(se[i-1]==0 &&se[i]==0&&se[i+1]==0){
                 se[i]=1;
                 i++;
                 c++;
             }
             }
        }
        if(c>=m){
            return true;
        }else
        return false;
    }
}
        

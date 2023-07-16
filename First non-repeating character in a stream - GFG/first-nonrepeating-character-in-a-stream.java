//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends



class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        String ans="";
            Map<Character,Integer> mp = new LinkedHashMap<>();
          StringBuilder res= new StringBuilder();
            for(int i=0;i < A.length();i++)
            {
                char c= A.charAt(i);
                mp.put(c, mp.getOrDefault(c, 0)+1);
                boolean fd= false;
                for(Map.Entry<Character, Integer> entry: mp.entrySet()){
                    if(entry.getValue()==1){
                        res.append(entry.getKey());
                        fd=true;
                        break;
                    }
                }
                if(!fd){
                    res.append("#");
                }
            }
            return  res.toString();
    }
}
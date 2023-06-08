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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends




class Solution {
    public List<String> find_permutation(String S) {
        // Code here
         List<String> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        boolean freq[] = new boolean[S.length()];
        recurPermute(S,ds,ans,freq);
        Collections.sort(ans, (a,b)->a.compareTo(b));
        return ans;
    }
    public void recurPermute(String S, List<String> ds, List<String> ans, boolean[] freq){
        if(ds.size()==S.length()){
            String a = String.join("",ds);
            if(!ans.contains(a)){
                ans.add(a);   
            }
            return;
        }
        for(int i=0; i<S.length(); i++) {
            if(!freq[i]){
                freq[i]=true;
                ds.add(S.charAt(i)+"");
                recurPermute(S,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}
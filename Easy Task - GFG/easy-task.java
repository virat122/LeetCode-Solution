//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
	public static void main (String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
                
        int t=Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            String s=in.readLine().trim();
            int q=Integer.parseInt(in.readLine().trim());
            query a[]=new query[q];
            for(int i=0;i<q;i++){
                String str=in.readLine().trim();
                String st[]=str.split(" ");
                if(st[0].trim().equals("1")){
                    a[i]=new query("1",st[1],st[2],"");
                }else{
                    a[i]=new query("2",st[1],st[2],st[3]);
                }
            }
            Solution ob=new Solution();
            ArrayList<Character> ans=ob.easyTask(n,s,q,a);
            for(char ch:ans){
                out.print(ch+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution {
    public static ArrayList<Character> easyTask(int n,String s,int qu,query queries[])
    {
        // jai sai baba
        char[] st = s.toCharArray();
        ArrayList<Character> res = new ArrayList<Character>();
        for(query q : queries){
            if (q.type.equals("1")){
                int ind  = Integer.parseInt(q.a);
                st[ind] =  q.b.charAt(0);
            }
            else{
                int start = Integer.parseInt(q.a);
                int end = Integer.parseInt(q.b);
                int k = Integer.parseInt(q.c);
                int ca[] = new int[26];
                for(int i =start;i<= end;i++){
                    ca[st[i]-'a']+=1;
                }
                int c = 0;
                for (int i =24+1;i>=0; i--){
                    c+=ca[i];
                    if (c>=k){
                        res.add((char)('a'+i));
                        break;
                    }
                }
            }
        }
        return res;
    }
}
/*In case the query is of type 1.
type=1
c=null
*/

/*In case the query is of type 2.
type=2
c=k
*/

class query
{
    String type;
    String a;
    String b;
    String c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}

        
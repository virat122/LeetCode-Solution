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

            String S;
            S = br.readLine();

            int target;
            target = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<String> res = obj.addOperators(S, target);
            Collections.sort(res);
            for (String s : res) System.out.print(s + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {

    public static void helper(ArrayList<String> ans, String res, String num, int target, int index, long val, long mul) {

        if(index == num.length()) {

            if(val == target) 

                ans.add(res);

                

            return;

        }

        

        for(int i =index; i < num.length(); i++) {

            if(i != index && num.charAt(index) == '0') break;

            long cur = Long.parseLong(num.substring(index, i + 1));

            if(index == 0) {

                helper(ans, res + cur, num, target, i + 1, cur, cur);

            } else {

                helper(ans, res + "+" + cur, num, target, i + 1, val + cur, cur);

                helper(ans, res + "-" + cur, num, target, i + 1, val - cur, -cur);

                helper(ans, res + "*" + cur, num, target, i + 1, val - mul + mul * cur, mul * cur);

            }

        }

    }

    public static ArrayList<String> addOperators(String S, int target) {

        // code here

        

        ArrayList<String> ans = new ArrayList<>();

        if(S.length() == 0 || S == null) return ans;

        helper(ans, "", S, target, 0, 0, 0);

        return ans;

    }

}

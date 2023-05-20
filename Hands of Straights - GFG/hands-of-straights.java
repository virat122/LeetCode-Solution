//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Pair implements Comparable<Pair> {
    int n;
    int f;

    public Pair(int n, int f) {
        this.n = n;
        this.f = f;
    }

    @Override
    public int compareTo(Pair o) {
        return o.n - this.n;
    }
}


class Solution {
    
    static boolean isStraightHand(int n, int k, int[] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        boolean ans = true;
        while (pq.size() >= k) {
            Pair[] parr = new Pair[k];
            Pair cp = pq.poll();
            parr[0] = cp;

            // find remaining (k - 1) elements
            for (int i = 1; i <= k - 1; i++) {
                Pair p = pq.poll();
                parr[i] = p;
                if (cp.n - p.n == 1) {
                    cp = p;
                    continue;
                }else {
                    ans = false;
                    break;
                }
            }

            if (!ans) {
                return false;
            }

            // add those elements back to the queue
            for (int i = 0; i < k; i++) {
                Pair pair = parr[i];
                // System.out.print(pair.n + " ");
                if (pair.f > 1) {
                    pq.add(new Pair(pair.n, pair.f - 1));
                }
            }

            // System.out.println();

        }

        return pq.isEmpty();
    }
}
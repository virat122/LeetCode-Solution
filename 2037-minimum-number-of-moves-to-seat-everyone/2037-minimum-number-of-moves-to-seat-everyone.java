class Solution {
    public int minMovesToSeat(int[] s, int[] st) {
            
            Arrays.sort(s);
            Arrays.sort(st);
            
            int c=0;
            for(int i=0;i<s.length;i++){
                    
                    int t=Math.abs(s[i]-st[i]);
                    c+=t;
                    
            }
            return c;
        
    }
}
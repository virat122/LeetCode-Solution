class Solution {
    public boolean checkValid(int[][] mat) {
            int m=mat.length,n=mat[0].length;
            
            Set<Integer> s=new HashSet<>();
             Set<Integer> s2=new HashSet<>();
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                           s.add(mat[i][j]);
                           s2.add(mat[j][i]) ;
                    }    
                    if(s.size()<n || s2.size()<m)
                            return false;
                    s.clear();
                    s2.clear();
            }
            
            return true;
        
    }
}
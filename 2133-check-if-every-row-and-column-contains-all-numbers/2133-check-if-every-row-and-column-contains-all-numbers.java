class Solution {
    public boolean checkValid(int[][] mat) {
            int m=mat.length,n=mat[0].length;
            
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                           s.add(mat[i][j]);
                            
                    }    
                    if(s.size()<n)
                            return false;
                    s.clear();
            }
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                           s.add(mat[j][i]);
                            
                    }    
                    if(s.size()<n)
                            return false;
                    s.clear();
            }
            return true;
        
    }
}
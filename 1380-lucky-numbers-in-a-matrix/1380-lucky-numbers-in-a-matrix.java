class Solution {
    public List<Integer> luckyNumbers (int[][] m) {
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<m.length;i++){
                   int min=findMinRow(m,i);
                   int max=findMinCol(m,min);
                   // System.out.println(]+"  "+max);
                   if(m[i][min]==max)ans.add(m[i][min]);
                    
            }
            return ans;
        
    }
    public int  findMinRow(int[][] m,int idx) {
                int  min=0;
            int ans=0;
           
            for(int i=0;i<m[0].length;i++){
                    if(m[idx][min]>m[idx][i])min=i;     
            }
                 return min;
                    
    }
         public int  findMinCol(int[][] m,int idx) {
                int  min=0;
                int ans=m[min][idx];
           
           
            for(int i=0;i<m.length;i++){
                    if(m[min][idx]<m[i][idx]){
                            ans=m[i][idx]   ; 
                            min=i;
                    }
            }
                 return ans;
                    
    }
        
}
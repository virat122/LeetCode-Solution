class Solution {
    public List<Integer> intersection(int[][] num) {
            List<Integer> ans=new ArrayList<>();
            int m=num.length;
            int n=num[0].length;
            for(int i=0;i<n;i++){
                    ans.add(num[0][i]);
            }
              List<Integer> temp;
            
            for(int i=1;i<num.length;i++){
                      temp=new ArrayList<>();
                    for(int j=0;j<num[i].length;j++){
                            if(ans.contains(num[i][j])){
                                    temp.add(num[i][j]);                                 
                            }          
                    }
                    ans=temp;
            }
            Collections.sort(ans);
            return ans;
            
            
            
            
        
    }
}
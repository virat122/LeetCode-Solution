class Solution {
    public int minDistance(String w1, String w2) {
            int arr[][]=new int [w1.length()][w2.length()];
            for(int i=0;i<w1.length();i++){
                    Arrays.fill(arr[i],-1);
            }
         return soln(w1,w2,0,0,arr);
            
                    
                    
            
        
    }
         public int soln(String w1, String w2,int idx1,int idx2, int arr[][]) {
            if(w1.length()==idx1 || w2.length()==idx2){
                    return Math.max(w1.length()-idx1,w2.length()-idx2);
            }
                 if(arr[idx1][idx2]!=-1){
                         return arr[idx1][idx2];
                 }
            
            char c1=w1.charAt(idx1);
            char c2=w2.charAt(idx2);
         
            int ans=0;
            if(c1==c2){
                  ans=soln(w1,w2,idx1+1,idx2+1,arr);
                    
            }else{
                   int  i=soln(w1,w2,idx1+1,idx2,arr);
                   int  d=soln(w1,w2,idx1,idx2+1,arr);
                   int   r=soln(w1,w2,idx1+1,idx2+1 ,arr);
                    ans=Math.min(i,Math.min(d,r))+1;
                    
            }
                 arr[idx1][idx2]=ans;
            return ans;
            
                    
                    
            
        
    }
}
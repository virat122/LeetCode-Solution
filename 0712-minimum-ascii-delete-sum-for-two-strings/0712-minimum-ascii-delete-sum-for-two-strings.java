class Solution {
    public int minimumDeleteSum(String w1, String w2) {
         int arr[][]=new int [w1.length()][w2.length()];
            for(int i=0;i<w1.length();i++){
                    Arrays.fill(arr[i],-1);
            }
           
            return soln(w1,w2,0,0 ,arr);
    }
        
         public int soln(String w1, String w2,int i1,int i2,int arr[][]) {
            if(w1.length()==i1 ||w2.length()==i2){
                    if(w1.length()==i1){
                            int p=0;
                            for(int i=i2;i<w2.length();i++){
                                    p+=w2.charAt(i);
                            }
                            return p;
                    }else{
                             int p=0;
                            for(int i=i1;i<w1.length();i++){
                                    p+=w1.charAt(i);
                            }
                            return p;
                    }
                   // return Math.max(w1.length()-i1,w2.length()-i2);
            }
            if(arr[i1][i2]!=-1)return arr[i1][i2];
            
            char c1=w1.charAt(i1);
            char c2=w2.charAt(i2);
            
           
            int ans=0;
            if(c1==c2){
                    ans= soln(w1,w2,i1+1,i2+1 ,arr);
            }else{
                    
                   int f= w1.charAt(i1)+soln(w1,w2,i1+1,i2,arr );
                    
                     int s =w2.charAt(i2)+soln(w1,w2,i1,i2+1,arr );
                    ans=Math.min(f,s);
            }
                arr[i1][i2]=ans;
        return ans;
    }
}
class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
            
            
            int strg[][] =new int [t1.length()+1][t2.length()+1];
            
            for(int i=t1.length()-1;i>=0;i--){
                    for(int j=t2.length()-1;j>=0;j--){
                            
                            if(t1.charAt(i)==t2.charAt(j)){
                                    strg[i][j]= strg[i+1][j+1]+1;
                            }else{
                                    int a=strg[i+1][j];
                                       int b=strg[i][j+1];
                                    strg[i][j]=Math.max(a,b);
                                    
                            }
                            
                    
                    }
                    
            }
            return strg[0][0];
            
            
            
            
            
            
            
            
            
            
            
            
//             for(int i=0;i<t1.length();i++)
//                 Arrays.fill(strg[i],-1); 
            
//             int ans=lcs(t1,t2,0,0,strg);
//             return ans;
    }
         public int lcs(String t1, String t2,int vidx1,int vidx2,int strg[][]) {
            if(t1.length()==vidx1|| t2.length()==vidx2){
               return 0;     
            }
                 if(strg[vidx1][vidx2]!=-1){
                       return strg[vidx1][vidx2];
                 }
            
            char c1=t1.charAt(vidx1);
            char c2=t2.charAt(vidx2);
            
           
            int ans=0;
            if(c1==c2){
               ans=lcs(t1,t2,vidx1+1,vidx2+1,strg)+1;    
            }else{
                    
                    int op1=lcs(t1,t2,vidx1,vidx2+1,strg);    
                     int op2=lcs(t1,t2,vidx1+1,vidx2,strg);  
                    ans=Math.max(op1,op2);
                    
            }
            strg[vidx1][vidx2]=ans;
            return ans;
            
        
    }
}
class Solution {
    public String multiply(String num1, String num2) {

      int n1=num1.length();
      int n2=num2.length();
            
            
       char f[]  = num1.toCharArray();  
       char s[]  = num2.toCharArray();  
            
      int []ans=new int[n1+n2];
            int p=0;
           for(int i=n2-1;i>=0 && p<n2;i-- ){
                   int c=0;
                   int res=0;
                   int val=0;
                   int k=(n1+n2-1)-p;
                   for(int j=n1-1;j>=0;j--){
                           res=(s[i]-'0')*(f[j]-'0')+c+ans[k];
                           val= res%10;
                           c=res/10;
                           ans[k]=val;
                           k--;
                   }    
                   
                   ans[k]+=c;
                   
          
                   p++;
                   
                   
           }  
            String str="";
            for(int i=0;i<n1+n2;i++){
                    if(i==0){
                            while( i<n1+n2 && ans[i]==0 ){
                                    i++;
                            }
                    }
                    if(i<n1+n2)
                    str+=ans[i];
                   
            }
            
            return str.equals("")?"0": str;
            
        
    }
}
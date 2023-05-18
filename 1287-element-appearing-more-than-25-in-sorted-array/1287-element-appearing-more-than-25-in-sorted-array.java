class Solution {
    public int findSpecialInteger(int[] arr) {
            int n=arr.length;
           int p=(n/4)+1;
            int c=0;
            if (n==1){
                    return arr[0];
            }
            
            for(int i=1;i<n;i++){
                    if(arr[i-1]==arr[i]){
                            c++;
                              if(c>=p){
                            return arr[i];
                              }
                    }else{
                            c=1;
                    }
                  
                    
                    
            }
            return 1;
            
        
    }
}
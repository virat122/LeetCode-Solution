class Solution {
    public int[] sortArrayByParityII(int[] arr) {
            int n=arr.length;
            int j=1,i=0;
           
            while(i < n && j<n){
                    if(arr[i]%2==0){
                            i+=2;
                    }
                    if(arr[j]%2==1){
                            j+=2;
                    }
                    if(  i < n && j<n && arr[i]%2!=0 && arr[j]%2!=1){
                            
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    i+=2;
                    j+=2;
                            
                    }
        
            }
            return arr;
            
        
    }
}
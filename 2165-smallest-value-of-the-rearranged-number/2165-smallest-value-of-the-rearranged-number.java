class Solution {
    public long smallestNumber(long num) {
            boolean f =false;
            if(num<0){
                    f=true;
                    num*=-1;
            }
            int z=0;
            
            // List<Integer> lst=new ArrayList<>();
            int arr[]=new int [10];
            
            while(num>0){
                    int r=(int) (num%10);
                    arr[r]++;
                    num/=10;       
            }
            double ans=0;
            
            if(f){
                    for(int i=9;i>=0;i--){
                            while(arr[i]>0){
                                    ans*=10;
                                    ans+=i;
                                    arr[i]--;
                            }
                    }
                    ans*=-1;
                    
                    
                    
            }else{
                     for(int i=1;i<=9;i++){
                                  
                             
                            while(  arr[i]>0 ){
                                    
                                   
                                    
                                    ans*=10;
                                    ans+=i;
                                    arr[i]--;
                                     while( ans> 0 && arr[0]>0){
                                          ans*=10;  
                                            arr[0]--;
                                           
                                    }
                            }
                    }
                    
            }
            
                    
                    
            
           
            
            
            
        return  (long)ans;
    }
}
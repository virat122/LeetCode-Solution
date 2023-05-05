class Solution {
    public int[] relativeSortArray(int[] a1, int[] a2) {
            int []count= new int [10001]  ;
            int []ans = new int [a1.length] ;
                    
            for(int i=0;i<a1.length;i++){
                    count[a1[i]]++;           
            }
            int k=0;
            System.out.println(count[7]);
            for(int i=0;i<a2.length;i++){
                    while(count[a2[i]]>0){
                      ans[k]= a2[i] ;
                            k++;
                            count[a2[i]]--;
                      }
                    
            }
            for(int i=0;i<1001;i++){
                    if(count[i]!=0)
                    {
                            while(count[i]>0){
                                    ans[k++]=i; 
                                    count[i]--;
                            }
                            
                           
                    }                    
            }
            return ans;
            
    }
}
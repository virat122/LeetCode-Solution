class Solution {
    public int minSetSize(int[] arr) {
            int n=arr.length/2;
           
           
            HashMap<Integer ,Integer> hm=new HashMap<>();
             HashMap<Integer ,Integer> shm=new HashMap<>();
            List<Integer> lst=new ArrayList<>();            
            for(int i:arr){
                    if(hm.containsKey(i)){
                            int p=hm.get(i);
                            hm.put(i,++p);
                    }else{
                            hm.put(i,1); 
                    }
            } 
            hm.forEach((k,v) -> {
                    //System.out.println(v+  "  "+ k);
                    lst.add(v);
                                      
            });
          int  idx=lst.size()-1;
                       Collections.sort(lst);
                       int c=0;
                       int ans=0;
                       while( c<n && idx>=0){
                               
                               ans++;
                               c+=lst.get(idx);
                               idx--;
                       }
                       
                       
                       
                   return ans;    
                      
            
                       
            
                       
                      
            
            
        
    }
}
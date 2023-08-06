class Solution {
    public int[] pivotArray(int[] n, int p) {
            List<Integer> lst=new ArrayList<>();
            int idx=0;
            
            for(int i=0;i<n.length;i++){
                    if(n[i]>p){
                           lst.add(n[i]) ;
                    }else if(n[i]==p){
                            lst.add(0,n[i]);
                    }else{
                            n[idx++]=n[i];
                    }
                    
            }
            for(int i: lst){
                    n[idx++]=i;
            }
            return n;
            
        
    }
}
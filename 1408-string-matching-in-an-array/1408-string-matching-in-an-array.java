class Solution {
    public List<String> stringMatching(String[] w) {
             List<String> lst=new ArrayList<>();
            for(int i=0;i<w.length;i++){
                    for(int j=0;j<w.length;j++){
                            if(  j==i)continue;
                            if(w[j].contains(w[i])){
                                    lst.add(w[i]);
                                    break;
                            }
                    }
                    
                    
            }
            return lst;
        
    }
}
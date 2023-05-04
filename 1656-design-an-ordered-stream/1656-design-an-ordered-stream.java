class OrderedStream {
  int idx=0;   
    String s[];
    public OrderedStream(int n) {
        s=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
            s[idKey-1]=value;
          List<String> ans=new ArrayList<String>(); 
            while( idx<s.length &&s[idx]!=null){
                    ans.add(s[idx++]);
            }
            return ans;
            
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
class MyHashSet {
        List<Integer> ans;

    public MyHashSet() {
            ans=new ArrayList<Integer>();
        
    }
    
    public void add(int key) {
            if(!ans.contains(key))ans.add(key);
        
    }
    
    public void remove(int key) {
            int t=ans.indexOf(key);
            if(t!=-1){
                    ans.remove(t);
            }
            
        
    }
    
    public boolean contains(int key) {
             if(ans.contains(key))return true;
            return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
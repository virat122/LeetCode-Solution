class RecentCounter {
        Queue <Integer> q;
        

    public RecentCounter() {
        this.q=new LinkedList<Integer>(); 
    }
    
    public int ping(int t) {
            if(q.isEmpty()){
                    q.add(t);
                    return 1;
            }
            if(t<3000 ){
                    q.add(t);
                   
            }else{
                    int dif=t-3000;
                    while( !q.isEmpty() && q.peek()<dif ){
                            q.poll();
                    }
                    q.add(t);
            }
             return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
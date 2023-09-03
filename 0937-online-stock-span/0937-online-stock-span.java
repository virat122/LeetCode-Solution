class StockSpanner {
    Stack<pair> st;
    int idx;
    public StockSpanner() {
        this.st=new Stack<pair>();   
        this.idx =-1;
    }
    
    public int next(int price) {
        idx++;
        while(!st.isEmpty() && st.peek().val<=price ){
            st.pop();

        }
        if(st.isEmpty()){
            st.add(new pair(idx,price));
            return idx+1;
        }else{
            int prev=st.peek().idx;
            st.add(new pair(idx,price));
            return idx-prev;
        }



    
       
        
    }
}
class pair{
    int idx;
    int val;
    pair(int p,int v){
        idx=p;
        val=v;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
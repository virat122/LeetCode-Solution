class MyStack {

    Deque<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.push(x);
    }
    
    public int pop() {
        if(!q.isEmpty())
            return q.removeFirst();
        return -1;
    }
    
    public int top() {
        return q.getFirst();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
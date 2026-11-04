class MinStack {
    Deque<Integer> st = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
            return;
        }
        if(st.peek()<=minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minStack.peek())){
            st.pop();
            minStack.pop();
            return;
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
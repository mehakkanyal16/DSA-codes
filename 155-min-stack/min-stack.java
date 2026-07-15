class MinStack {
    Stack<Integer>st;
    Stack<Integer>minStack;

    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();

        
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.isEmpty()||value<=minStack.peek()){
            minStack.push(value);
        }
        
    }
    
    public void pop() {
        int popValue=st.pop();
        if(popValue==minStack.peek()){
            minStack.pop();
        }
        
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
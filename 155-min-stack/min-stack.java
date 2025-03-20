class MinStack {
    Stack<Integer>st;
    Stack<Integer>minstack;

    public MinStack() {
        st=new Stack<>();
        minstack=new Stack<>();


    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty()||minstack.peek()>=val){
            minstack.push(val);

        }
        
    }
    
    public void pop() {
        int popValue=st.pop();
        if(popValue==minstack.peek()){
            minstack.pop();
        }
      
        
    }
    
    public int top() {
       return  st.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
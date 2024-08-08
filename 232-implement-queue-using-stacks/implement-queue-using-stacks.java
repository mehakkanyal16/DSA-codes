class MyQueue {
    private Stack<Integer> first=new Stack<>();
    private Stack<Integer> second=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        first.push(x);
        
    }
    
    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }
        return removed;
        
    }
    
    public int peek() {
         while(!first.empty()){
            second.push(first.pop());
        }
        int peeked=second.peek();
        while(!second.empty()){
            first.push(second.pop());
        }
        return peeked;

        
    }
    
    public boolean empty() {
        return first.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
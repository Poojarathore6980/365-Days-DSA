class MinStack {
   private  Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
      mainStack = new Stack<>();
      minStack = new Stack<>();  
        
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty()){
            minStack.push(mainStack.peek());
        }
        else{
            int currMin= minStack.peek();
            minStack.push(currMin< value ? currMin : value);
        }
        
    }
    
    public void pop() {
        if(!mainStack.isEmpty()){
            mainStack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
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
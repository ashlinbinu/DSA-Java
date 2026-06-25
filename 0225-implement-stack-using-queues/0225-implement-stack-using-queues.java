class MyStack {
    private Queue<Integer> myStack;
    public MyStack() {
        myStack = new LinkedList<>();
        
    }
    
    public void push(int x) {
        
        int csize = myStack.size();
        myStack.add(x);
        for(int i = 0;i<csize;i++)
        {
            myStack.add(myStack.remove());
        }
    }
    
    public int pop() {

         return myStack.remove();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public boolean empty() {
        return myStack.isEmpty();
        
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
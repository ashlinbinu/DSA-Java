class MinStack {

Stack<Integer> st;
Stack<Integer> minstack;
int minm;
    public MinStack() {
        st = new Stack<>();
        minstack = new Stack<>();
        minm= Integer.MAX_VALUE;
        
            }
    
    public void push(int value) {
        st.push(value);
        if(value<=minm)
        {
            minstack.push(value);
        }
        minm = Math.min(value,minm);
    }
    
    public void pop() {
        if(st.isEmpty() == false)
        {
            int x= st.pop();
        
        if(x== minm)
        {
            if(!minstack.isEmpty())
            {
            int y = minstack.pop();
            }
            if(!minstack.isEmpty())
            {
                minm = minstack.peek();
            }
            else
            {
                minm = Integer.MAX_VALUE;
            }
            
            
        }
        }

    }
    
    public int top() 
    {
        if(!st.isEmpty())
        {
            return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!st.isEmpty())
        {
            return minm;
        }
        return 0;
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
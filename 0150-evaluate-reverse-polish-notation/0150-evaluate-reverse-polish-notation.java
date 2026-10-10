class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        if(tokens.length ==1)
        {
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> st = new Stack<>();
        
        st.push(Integer.parseInt(tokens[0]));
        
        st.push(Integer.parseInt(tokens[1]));
        int i = 2;

        while(i<tokens.length)
        {

            if(tokens[i].equals("*"))
            {
                int a =201;
                if(!st.isEmpty())
                {
                    a = st.pop();
                }
                if(a!=201)
                {
                     if(!st.isEmpty())
                {

                    st.push(a*st.pop());
                }
                }
               
               
                
            }
            else if(tokens[i].equals("/"))
            {
                 int a =201;
                if(!st.isEmpty())
                {
                    a = st.pop();
                }
                if(a!=201)
                {
                    if(!st.isEmpty() && a!=0)
                {
                    st.push(st.pop()/a);
                }
               

                
               
                } 
                
            }
            else if(tokens[i].equals("+"))
            {
                int a =201;
                if(!st.isEmpty())
                {
                    a = st.pop();
                }
                if(a!=201)
                {
                    if(!st.isEmpty() && a!=0)
                {
                    st.push(st.pop()+a);
                }
               

                
               
                } 
                
                
            }
            else if(tokens[i].equals("-"))
            {
               int a =201;
                if(!st.isEmpty())
                {
                    a = st.pop();
                }
                if(a!=201)
                {
                    if(!st.isEmpty() && a!=0)
                {
                    st.push(st.pop()-a);
                }
               

                
               
                } 
               
                
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
            i++;

        }
        return st.peek();
    }
}
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> mystack = new Stack<>();
        int val = 0;
        mystack.push(-1);
        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                mystack.push(i);
            }
            else
            {
                mystack.pop();
                if(mystack.isEmpty())
                {mystack.push(i);}
                else
                {
                val = Math.max(i - mystack.peek(),val);}
            }

        }
        return val;
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
        int open= 0;
        int close = 0;
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               st.push('(');
            }
            else
            {
                if(st.isEmpty()==false && st.peek()=='(')
                {
                     st.pop();
                }
                else
                {
                    st.push(')');
                }
               
            }
        }

        while(st.isEmpty()==false)
        {
            int x = st.pop();
            count++;
        }
        return Math.abs(count);
    }
}
class Solution {
    public int maxDepth(String s) {
        int maxm = 0;
        int open = 0;
        int close = 0;
        for(int i = 0; i< s.length();i++)
        {
            maxm = Math.max(open-close,maxm);
            if(s.charAt(i) == '(')
            {
                open++;
            }
            else if(s.charAt(i)==')')
            {
                close++;
            }
        }
        return maxm;
    }
}
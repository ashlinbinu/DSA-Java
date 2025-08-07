class Solution {
    public boolean isPalindrome(int x) {
        int m = x;
        int rev = 0;
        while(m>0)
        {
            int d = m%10;
            m=m/10;
            rev = (rev*10) +d;
        }
        if(rev ==x)
        {return true;}
        else
        {return false;}
    }
}
class Solution {
    public int reverse(int x) {
        long rev = 0;
        int flag =0;
        int m = x;
        if(x<0){
            m = Math.abs(x);
            flag = 1;
        }
        
        while(m>0)
        {
            int d = m%10;
            m=m/10;
            rev = (rev*10) +d;
        }
        if(flag == 1)
        {
            rev *=-1;
        }
         if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;}
        
        
    }

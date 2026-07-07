class Solution {
    public long sumAndMultiply(int n) {
        if (n ==0) return 0L;
        int m = n;
        String s= "";
        int sum = 0;
        while(m>0)
        {
            int x = (int)m %10;
            m= m/10;
            sum+=x;
            if(x!=0)
            {s = s+ x+"";}

        }
        String ans = new StringBuilder(s).reverse().toString();
        long res = Long.parseLong(ans)*sum;
        return res;
    }
}
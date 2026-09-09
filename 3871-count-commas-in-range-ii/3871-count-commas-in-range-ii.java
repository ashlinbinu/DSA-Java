class Solution {
    public long countCommas(long n) {
       
        long n2 = n;
        long ans = 0;
        
        if(n<1000)
        {
            return 0L;
        }
        long maxval = 1;
        for(int i = 1; i<=15;i++)
        {
            maxval*=10;
        }

       for(long i = 1000;i<=maxval;i*=1000)
       {
            ans += Math.max(0,n-i+1);
       }
        return ans;
    }
}
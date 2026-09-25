class Solution {
    public int numSquares(int n) {
        int maxm = (int)Math.sqrt(n);
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<=maxm;i++)
        {
            int sqr = i*i;
            for(int j = sqr;j<dp.length;j++)
            {
                if(dp[j-sqr]!=Integer.MAX_VALUE)
                {
                    dp[j] = Math.min(dp[j],dp[j-sqr]+1);
                }
            }
        }
       if(dp[dp.length-1]== Integer.MAX_VALUE)
        {
            return -1;
        }
return dp[dp.length-1];
    }
}
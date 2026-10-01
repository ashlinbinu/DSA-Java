class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length+1][2][k+1];

        



        for(int i = prices.length-1;i>=0;i--)
        {
            for(int j = 0 ; j<2;j++)
            {
                for(int b =1; b<=k;b++)
                {
                    if(j == 1)
        {
            dp[i][j][b] = Math.max(dp[i+1][0][b]-prices[i],dp[i+1][1][b]);
        }
        else
        {
            dp[i][j][b] = Math.max(dp[i+1][1][b-1]+prices[i],dp[i+1][0][b]);
        }
                }
            }
        }
        return dp[0][1][k];
    }
}
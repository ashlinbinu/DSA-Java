class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];

        for(int i = 0; i< prices.length;i++)
        {
            for(int j = 0; j< 2;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(dp,0,1,2,prices);
    }

    int helper( int[][][] dp , int i , int j, int k , int[] prices)
    {
        if(i == prices.length)
        {
            return 0;
        }
        if(k == 0)
        {
            return 0;
        }
        if(dp[i][j][k] !=-1){return dp[i][j][k];}
        //buy case
        if(j == 1)
        {
            dp[i][j][k] = Math.max(helper(dp,i+1,0,k,prices)-prices[i],0+helper(dp,i+1,1,k,prices));
        }
        else
        {
            dp[i][j][k] = Math.max(helper(dp,i+1,1,k-1,prices)+prices[i],0+helper(dp,i+1,0,k,prices));
        }
        return dp[i][j][k];
    }
}
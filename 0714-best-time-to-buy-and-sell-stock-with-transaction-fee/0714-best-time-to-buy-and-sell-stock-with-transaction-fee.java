class Solution {
    public int maxProfit(int[] prices, int fee) {
         int[][] dp = new int[prices.length][2];

        for(int i = 0; i< prices.length;i++)
        {
            
                Arrays.fill(dp[i],-1);
            
        }
        return helper(dp,0,1,prices, fee);
    }

    int helper( int[][] dp , int i , int j,  int[] prices, int fee)
    {
        if(i == prices.length)
        {
            return 0;
        }
        
        if(dp[i][j] !=-1){return dp[i][j];}
        //buy case
        if(j == 1)
        {
            dp[i][j] = Math.max(helper(dp,i+1,0,prices,fee)-prices[i],0+helper(dp,i+1,1,prices,fee));
        }
        else if(j == 0)
        {
            dp[i][j] = Math.max(helper(dp,i+1,1,prices,fee)+prices[i]-fee,0+helper(dp,i+1,0,prices,fee));
        }
        
        return dp[i][j];
    }
}
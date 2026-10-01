class Solution {
    public int maxProfit(int[] prices) {
       
        int[][] dp = new int[prices.length][3];

        for(int i = 0; i< prices.length;i++)
        {
            
                Arrays.fill(dp[i],-1);
            
        }
        return helper(dp,0,2,prices);
    }

    int helper( int[][] dp , int i , int j,  int[] prices)
    {
        if(i == prices.length)
        {
            return 0;
        }
        
        if(dp[i][j] !=-1){return dp[i][j];}
        //buy case
        if(j == 2)
        {
            dp[i][j] = Math.max(helper(dp,i+1,0,prices)-prices[i],0+helper(dp,i+1,2,prices));
        }
        else if(j == 0)
        {
            dp[i][j] = Math.max(helper(dp,i+1,1,prices)+prices[i],0+helper(dp,i+1,0,prices));
        }
        else if(j ==1)
        {
            dp[i][j] = helper(dp,i+1,2,prices);
        }
        return dp[i][j];
    }
}
   
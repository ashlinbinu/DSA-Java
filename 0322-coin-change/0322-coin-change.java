class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 0 ; i< coins.length;i++)
        {
            int x= coins[i];
            for(int j = x; j<dp.length;j++ )
            {
                
                if(dp[j-x]!=Integer.MAX_VALUE)
                {
                dp[j] = Math.min(dp[j],dp[j-x]+1);}
            }
        }
        if(dp[dp.length-1]== Integer.MAX_VALUE)
        {
            return -1;
        }
return dp[dp.length-1];
    }
}
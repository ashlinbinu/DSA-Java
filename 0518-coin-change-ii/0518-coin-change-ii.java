class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i = 0; i< dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        return helper(coins,0, amount,dp);

    }

    public int helper(int[] coins,int index, int target,int[][] dp)
    {
        if(target == 0)
        {
            return 1;
        }
        if(index == coins.length)
        {
            return 0;
        }
        
        if(dp[index][target]!=-1){return dp[index][target];}
        int take = 0;

if(coins[index]<=target)
{
        take = helper(coins,index,target-coins[index],dp);}
        int nottake = helper(coins,index+1,target,dp);

        return dp[index][target] = take+nottake;
    }
}
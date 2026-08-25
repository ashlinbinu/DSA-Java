class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        //  1 100 1 1 1 100 1 1 100 1
        //0 I  I  I I I  I  I I  I  I
        for(int i =0;i<dp.length-2;i++)
        {
            dp[i+1]= Math.min(dp[i+1],dp[i]+cost[i]);
            dp[i+2] = Math.min(dp[i+2],dp[i]+cost[i+1]);
        }
        // 10 +1  10
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
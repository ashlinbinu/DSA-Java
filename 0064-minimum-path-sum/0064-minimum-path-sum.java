class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp= new int[grid.length][grid[0].length];
        for(int i = 0; i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);

        }
        dp[0][0] = grid[0][0];
        //first row
        for(int i = 1; i< dp[0].length;i++)
        {
            dp[0][i]= dp[0][i-1]+grid[0][i];
        }
        //first column
        for(int j = 1; j< dp.length;j++)
        {
            dp[j][0] = dp[j-1][0]+grid[j][0];
        }
        //rest

        for(int i = 1;i<dp.length;i++)
        {
            for(int j = 1; j< dp[0].length;j++)
            {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
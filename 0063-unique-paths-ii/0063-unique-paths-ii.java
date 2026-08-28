class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // edge cases handling

        if(obstacleGrid[0][0] == 1)
        {
            return 0;
        }
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1)
        {
            return 0;
        }

        if(obstacleGrid.length == 1 && obstacleGrid[0].length == 1)
        {
            return 1;
        }

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0 ; i< obstacleGrid.length;i++)
        {
            Arrays.fill(dp[i],0);
        }
        helper(0,0,dp,obstacleGrid);
        return dp[0][0];
    }

    public void helper(int i , int j , int[][] dp ,int[][] obs)
    {
        if(i<0 || i>=dp.length || j<0 || j>dp[0].length)
        {
            return ;
        }
        if(dp[i][j]!=0 || obs[i][j] == 1){return;}
        
        if(i== dp.length-1 && j == dp[0].length-1)
        {
            dp[i][j] = 1;
        }
        if(i+1>=0 && i+1<dp.length)
        {
            helper(i+1,j,dp,obs);
            dp[i][j] +=dp[i+1][j];
        }
        
        if(j+1>=0 && j+1<dp[0].length)
        {
            helper(i,j+1,dp,obs);
            dp[i][j] +=dp[i][j+1];
        }

    }
}
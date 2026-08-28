class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i< m;i++)
        {
            Arrays.fill(dp[i],0);
        }
        if(m==1 || n==1)
        {
            return 1;
        }

        helper(0,0,dp);
        return dp[0][0];
    }
    public void helper(int i , int j ,int[][] dp)
    {
        
        int m =dp.length;
        int n = dp[0].length;
        if((i<0 || i>=m) || (j<0 || j>=n)){return ;}
        if(dp[i][j]!=0){return;}
        if(i == m-1 && j == n-1)
        {
            dp[m-1][n-1] = 1;
        }
        
        if(i+1>0 && i+1<dp.length)
        {
            helper(i+1,j,dp);
        dp[i][j] = dp[i][j]+ dp[i+1][j];
        }
        if(j+1>0 && j+1<dp[0].length)
        {
            helper(i,j+1,dp);
        dp[i][j] = dp[i][j]+ dp[i][j+1];
        }
        
    }
}
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int onecount = 0;
        int twocount = 0;
        for(int i = 0; i<=n;i++)
        {
            if(i==0 || i==1){dp[i]=1;}
            else{dp[i] = dp[i-1]+dp[i-2];}

        }

        return dp[n];
    }
}
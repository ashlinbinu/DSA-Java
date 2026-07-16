class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        
        for(int i = 0; i<=n;i++)
        {
        if(i==0){dp[0] = 0;}
        else if(i==1){dp[1] =1;}
        else{
        dp[i] = 1+dp[i&(i-1)];
        }}
        return dp;
    }
}
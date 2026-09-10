class Solution {
    public int minInsertions(String s) {
        String t = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int x = 0; x<dp.length;x++)
        {
            Arrays.fill(dp[x],0);
        }
        

        for(int i = 1; i<dp.length;i++)
        {
            for(int j = 1; j<dp[0].length;j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return s.length()-dp[s.length()][t.length()];
    }
}
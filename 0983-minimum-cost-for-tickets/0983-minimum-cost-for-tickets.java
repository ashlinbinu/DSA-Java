class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int i = 1;
        int j = 0;
        while(i< dp.length )
        {
            if(j<days.length && i==days[j])
            {
                int option1 = dp[i-1]+costs[0];
                int option7 = dp[Math.max(0,i-7)]+costs[1];
                int option30 = dp[Math.max(0,i-30)]+costs[2];
                int a = Math.min(option1,option7);
                dp[i] = Math.min(a,option30);
                j++;
               
            }
            else
            {
                 dp[i] = dp[i-1];
                
            }
            i++;


        }
        return dp[days[days.length-1]];
    }
}
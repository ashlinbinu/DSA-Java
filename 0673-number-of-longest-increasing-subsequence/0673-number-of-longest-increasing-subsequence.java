class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        if (nums.length <= 1) return nums.length;
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int maxlen = 1;
        int n = nums.length;
        for(int i = 0; i< nums.length;i++)
        {
            for(int j = 0; j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[i]<dp[j]+1)
                    {
                       
                        dp[i] = dp[j]+1;
                        count[i] =count[j];
                        
                    }
                else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j]; // Add alternative paths of the same max length
                    }
                }
            }
            maxlen = Math.max(maxlen,dp[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxlen) {
                result += count[i];
            }
        }

        return result;

    }
}
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
         int[] dp = new int[nums.length];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        for(int i = 0; i< nums.length;i++)
        {
            for(int j = 0; j<i;j++)
            {
                if(nums[i]%nums[j]==0)
                {
                dp[i] = Math.max(dp[i],dp[j]+1);}
            }
        }

         int max = 0;
        for(int i = 0;i< dp.length;i++)
        {
            if(dp[max]<dp[i])
            {
                max = i;
            }
            
        }
        ans.add(nums[max]);
        // retracing 
        for(int i = max-1;i>=0;i--)
        {
            if(dp[i] ==dp[max]-1 && nums[max]%nums[i]==0)
            {
                ans.add(nums[i]);
                max = i;
            }
        }
        return ans;
    }
}
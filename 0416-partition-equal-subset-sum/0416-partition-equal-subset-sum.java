class Solution {
    public boolean canPartition(int[] nums) {
        // find the sum
        int sum =0;
        for(int i = 0; i< nums.length ;i++)
        {
            sum+= nums[i];
        }

        // target = sum/2
        // so odd number not a chance

        if(sum%2 == 1)
        {
            return false;
        }

        int[][] dp = new int[nums.length+1][sum/2+1];

        for(int i = 0; i< dp.length; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        int x = helper(nums.length-1,sum/2,dp,nums);
        return x == 1;


    }

    public int helper(int index, int target, int[][] dp , int[] nums)
    {
        if(target == 0){
            dp[index][target] = 1;
            return dp[index][target];
        }
        if(index == 0)
        {
            dp[index][target] =(target == nums[index])?1:0;
        }
        if(dp[index][target] != -1){return dp[index][target];}
        int nottake = helper(index-1, target, dp, nums);
        int take = (target >= nums[index])?helper(index-1,target-nums[index],dp,nums):0;
        boolean res = (nottake == 1 || take == 1);
        return dp[index][target] = (res == true)?1:0;
        
    }
}
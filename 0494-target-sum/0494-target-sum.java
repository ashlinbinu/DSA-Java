class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++)
        {
            sum+= nums[i];

        }
        return helper(nums,target,0);


    }

    public int helper(int[] nums, int target, int index)
    {
        if(index == nums.length)
        {
            return target == 0 ? 1:0;
        }

        int add = helper(nums,target-nums[index],index+1);
        int subtract = helper(nums,target+nums[index],index+1);
        return add+subtract;
    }
}
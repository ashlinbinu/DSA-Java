class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length -1;
        int  count = 0;
        int MOD = 1000000000+7;
       int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }
        while(left<= right)
        {
            if(nums[left]+nums[right]> target)
            {
                right --;
            }
            else
            {
                count=(count+ power[right-left]) % MOD;
                left++;
            } 

        }
        return count;
    }
}
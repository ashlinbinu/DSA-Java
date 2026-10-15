class Solution {

    public int findMin(int[] nums) {
        int minm = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length;i++)
        {
            minm = Math.min(minm,nums[i]);
        }
        return minm;
    }
}
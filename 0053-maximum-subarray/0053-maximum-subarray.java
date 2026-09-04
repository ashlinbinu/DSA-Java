class Solution {
    public int maxSubArray(int[] nums) {
        //KADANE'S ALGORITHM
        // WE EITHER EXTEND OR START A NEW SUBARRAY
        //EXTEND IF SUBARRAY+CURRENT>SUBARRAY
        //ELSE START AFRESH

        // CASE 1: SUBARR(+VE) CURRENT ELEMENT(+VE) --> EXTEND
        // CASE 1: SUBARR(-VE) CURRENT ELEMENT(+VE) --> EXTEND
        // CASE 1: SUBARR(+VE) CURRENT ELEMENT(-VE) --> EXTEND
        // CASE 1: SUBARR(-VE) CURRENT ELEMENT(-VE) --> START
        int currsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1 ;i< nums.length;i++)
        {
            currsum = Math.max(nums[i],currsum+nums[i]);
            maxsum = Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}
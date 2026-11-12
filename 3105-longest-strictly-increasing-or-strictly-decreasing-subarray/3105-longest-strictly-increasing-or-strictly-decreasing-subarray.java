class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int im = 1;
        int dm = 1;
        for(int i = 1; i< nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                inc++;
                im = Math.max(inc,im);
            }else
            {
                inc = 1;

            }
            if(nums[i]<nums[i-1])
            {
                dec++;
                dm = Math.max(dec,dm);
            }
            else
            {
                dec = 1;
            }
        }
        return Math.max(dm,im);
    }
}
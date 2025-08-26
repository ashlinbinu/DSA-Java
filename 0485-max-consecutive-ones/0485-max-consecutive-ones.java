class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int maxcount = 0;
        for(int i = 0 ;i<nums.length;i++)
        {
            if(nums[i] ==1)
            {c++;}
            else if(nums[i] ==0)
            {c =0;}
            if (c> maxcount)
            {maxcount = c;}

        }
        return maxcount;
    }
}
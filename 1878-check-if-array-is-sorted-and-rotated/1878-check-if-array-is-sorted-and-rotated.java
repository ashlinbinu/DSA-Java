class Solution {
    public boolean check(int[] nums) {
        int drop = 0;
        for(int i = 0; i<nums.length-1 ;i++)
        {
            if(nums[i]>nums[i+1])
            {
                drop++;
            }
        }
        if(drop ==0)
        {
            return true;
        }
        else if(drop ==1)
        {
            if(nums[nums.length-1]>nums[0])
            {return false;}
            return true;
        }
        return false;
        
    }
}
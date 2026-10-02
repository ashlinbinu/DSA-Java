class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while(i<nums.length)
        {
            if(nums[i] == i+1)
            {
                i++;
            }
            else
            {
                int swapelement = nums[nums[i]-1];
                if(swapelement != nums[i])
                {
                    nums[nums[i]-1] = nums[i];
                    nums[i] = swapelement;
                    
                }
                else
                {
                    i++;
                }
            }
        }

        for(int j= 0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{0,0};
    }
}
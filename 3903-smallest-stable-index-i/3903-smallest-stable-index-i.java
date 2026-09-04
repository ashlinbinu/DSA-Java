class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length;i++)
        {
            min = Math.min(min,nums[i]);
        }
        if(max-min<=k){return 0;}

        for(int x= 1; x< nums.length;x++)
        {
            max = Math.max(max,nums[x]);
            if(max-min<=k){return x;}   
            if(min == nums[x])
            {min = Integer.MAX_VALUE;

                for(int i = x+1; i< nums.length;i++)
        {
            min = Math.min(min,nums[i]);
        }
            }
        
        }
        return -1;
    }
}
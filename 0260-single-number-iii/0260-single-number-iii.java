class Solution {
    public int[] singleNumber(int[] nums) {
        

        // 1 2 1 3 2 5 
        // 6
        // 
        long res = 0;
        for(int i = 0; i<nums.length;i++)
        {
          res^=nums[i];
        }

        int[] ans = new int[2];
        
        
        int y = (int)(res&(-(long)res));
        for(int i = 0; i<nums.length;i++)
        {
            if((nums[i]& y )== y)
            {
                ans[0]^=nums[i];
            }
            else
            {
                ans[1]^=nums[i];
            }
        }
        

        return ans;
    }
}
import java.util.*;
class Solution 
{
    public int[] buildArray(int[] nums) 
    {
        int[] ans = new int[nums.length];
        for( int i = 0; i< nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;

        

        
    }
    public static void main(String[] Args)
    {
        Solution sol = new Solution();
        int[] nums = {0, 7, 5, 4, 3, 1, 2, 6};
        int[] result = sol.buildArray(nums);
       

    }
}
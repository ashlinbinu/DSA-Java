class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] rightsum = new int[nums.length];
        int[] leftsum = new int[nums.length];
        rightsum[nums.length-1] =0;
        leftsum[0] =0;
        int sumleft = 0;
        int sumright = 0;
        for(int i = 0; i < nums.length;i++)
        {
            sumleft += nums[i];
            leftsum[i] = sumleft;
            

        }
        for(int i = nums.length-1; i >=0;i--)
        {
            sumright += nums[i];
            rightsum[i] = sumright;

        }
        


        for(int j = 0; j<nums.length;j++)
        {
            nums[j] = (int)(Math.abs(leftsum[j]-rightsum[j]));
        }
    return nums;
    }
}
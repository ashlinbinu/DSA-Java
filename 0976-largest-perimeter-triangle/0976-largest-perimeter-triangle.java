class Solution {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        

        int i = nums.length-1;
        int ans = 0;
        while(i>=2)
        {
            int prevcount1 = nums[i-1];
            int prevcount2 = nums[i-2];
            if(nums[i]<prevcount1+prevcount2)
            {
                ans+=nums[i]+prevcount1+prevcount2;
                break;
            }
            i--;
        }
        return ans;
    }
}
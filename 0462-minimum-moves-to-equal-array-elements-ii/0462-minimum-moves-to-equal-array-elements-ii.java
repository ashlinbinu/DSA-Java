class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = 0+((nums.length-1)+0)/2;
        // 1 2 9 10 
        int c = 0;
        for(int i = 0; i< mid;i++)
        {
            c+=nums[mid]-nums[i];
        }
        for(int i = mid+1;i<nums.length;i++)
        {
            c+=nums[i]-nums[mid];
        }
        return c;

    }
}
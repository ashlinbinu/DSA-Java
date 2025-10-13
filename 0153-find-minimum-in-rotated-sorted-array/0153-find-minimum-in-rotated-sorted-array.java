class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        int low = 0;
        int high = nums.length -1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=ans)
                {
                ans = nums[low];}
                low = mid+1;
            }
            else if(nums[high]>=nums[mid])
            {
                if(ans>=nums[mid])
                {ans = nums[mid];}
                high = mid -1;
            }
        }
        return ans;
    }
}
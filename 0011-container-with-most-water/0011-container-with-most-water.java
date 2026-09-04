class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while(left<=right)
        {
            max = Math.max(Math.min(height[left],height[right])*(right-left),max);

            if(height[left]>height[right] && right-1>=0 )
            {
                right--;

            }
            else
            {
                left++;
            }
        }
        return max;
    }
}
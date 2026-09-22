class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int leftsum =0;
        int rightsum = 0;
        int[] presum = new int[nums.length];
       
        for(int i = 0; i<nums.length;i++)
        {
            presum[i] = sum;
            sum+=nums[i];
        }//0 2 5 4 12 
        

        int minindx = Integer.MAX_VALUE;
        for(int i = nums.length-1;i>=0;i--)
        {
            if(rightsum == presum[i])
            {
                minindx = Math.min(minindx,i);
            }
            rightsum+=nums[i];
        }
        return minindx==Integer.MAX_VALUE?-1:minindx;

    }
}
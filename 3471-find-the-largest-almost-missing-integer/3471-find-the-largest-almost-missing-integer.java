class Solution {
    public int largestInteger(int[] nums, int k) {
       int[] arr = new int[51];

        if(nums.length ==k)
        {
            int max = Integer.MIN_VALUE;

            for(int i = 0 ;i< k ;i++)
            {
                if(nums[i]>max)
                {
                    max = nums[i];
                }
            }
            return max;
        }
        for(int i = 0; i< nums.length;i++)
        {
            if(i<k )
            {
                arr[nums[i]]+=i+1;
            }
            else if(nums.length-i<k)
            {
                arr[nums[i]] +=(nums.length-i);//
            }
            else
            {
                arr[nums[i]]+=k;
            }
        }
        
        for(int i = 50; i>=0;i--)
        {
            if(arr[i]==1)
            {
                return i;
            }
        }
        return -1;
    }
}
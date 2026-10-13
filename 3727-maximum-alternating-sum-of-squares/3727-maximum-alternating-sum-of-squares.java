class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i = 0; i< nums.length;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        long ans = 0l;
        int i = 0;
        int j = nums.length-1;
        while(i<j)
        {
            ans+=nums[j]*nums[j]-nums[i]*nums[i];
            j--;
            i++;

        }
        if(nums.length%2==1)
        {
            ans+=nums[i]*nums[i];
        }
        return ans;


    }
}
class Solution {

    public int sum(int i , int j , int[] arr)
    {
        int sum = 0;
        for(int a= i; a<=j;a++)
        {
            sum+=arr[a];
        }
        return sum;
    }
    public int subarraySum(int[] nums, int k) {
       int[] prefixsum = new int[nums.length];
       int sum = 0;
       for(int i = 0; i<nums.length;i++)
       {
        sum+=nums[i];
        prefixsum[i]= sum;
       }
       int count = 0;
       for(int i = 0; i< prefixsum.length;i++)
       {
            if(prefixsum[i] == k)
            {
                count++;
            }
           for(int j = 0; j< i;j++)
                {
                    if(prefixsum[i]-prefixsum[j] == k)
                    {
                        count++;
                    }
                }
        

       }
       return count;
    }
}
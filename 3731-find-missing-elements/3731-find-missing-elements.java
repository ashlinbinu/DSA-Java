class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        // 10 2 7 4 5 6 11
        int min = 101;
        int max = 0;
        for(int i = 0 ; i< nums.length;i++)
        {
            if(nums[i]>max)
            {
                max= nums[i];
            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
        }

        for(int i = min ; i<max;i++)
        {
            boolean exist = false;
            for(int n: nums)
            {
                if(i == n)
                {
                    exist = true;
                }
            }
            if(exist == false)
            {
                missing.add(i);
            }
        }
        return missing;
    }
}
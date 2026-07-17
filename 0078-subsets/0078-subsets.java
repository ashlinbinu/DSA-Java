class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for(int i = 0; i<(int)Math.pow(2,nums.length);i++)
        {
            
            int j = 0;
            int temp = i;
            
            while(temp>0 && j<nums.length)
            {
                if((temp&1 )==1)
                {
                    inner.add(nums[j]);
                    
                }
                j++;
                temp=temp>>1;
            }
            output.add(new ArrayList<>(inner));
            inner.clear();
            
        }
        return output;
    }
}
class Solution {
    public int sortPermutation(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<nums.length;i++)
        {
            if(i!=nums[i])
            {
                l.add(nums[i]);
            }
        }
        if(l.isEmpty()){return 0;}
       int ans = l.get(0);
       for(int i  = 1; i<l.size();i++)
       {
        ans &=l.get(i);
       }
        return ans;
    }
}
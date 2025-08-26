class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : nums)
        {
            list.add(x);
        }
        int i =0;
        for(i=0;i<=nums.length;i++)
        {
            if(list.contains(i)!=true)
            {
                break;
            }
        }
        return i;
    }
}
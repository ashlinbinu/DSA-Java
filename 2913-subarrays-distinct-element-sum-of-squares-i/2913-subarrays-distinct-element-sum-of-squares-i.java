class Solution {
    public int sumCounts(List<Integer> nums) {
        int total = 0;
        for(int i =0; i<nums.size();i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j<nums.size();j++)

            {// 1 2 1

               
                set.add(nums.get(j));
                total+=set.size()*set.size();
            }
            
        }
        
        return total;
    }
}
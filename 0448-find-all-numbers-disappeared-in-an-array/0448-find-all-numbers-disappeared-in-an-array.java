class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans =new ArrayList<>();
        for(int i = 1; i<= nums.length;i++)
        {
            map.put(i,0);
        }
        for(int i = 0 ; i< nums.length ;i++)
        {
            map.put(nums[i],map.get(nums[i])+1);
        }
        for(int i = 1; i<= nums.length;i++)
        {
            if(map.get(i)==0)
            {
                ans.add(i);
            }
        }
        return ans;


        

    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        //IDEAL APPROACH IS USING A CYCLIC SORT
        // EVERY NUMBER X BELONGS TO THE INDEX X-1
        // THEN WE RUN A LOOP WHEREVER THERE ARE IRREGULARITIES AT THAT INDEX WE HAVE THE MISSING NUMBER WHICH WILL BE INDEX X+1
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
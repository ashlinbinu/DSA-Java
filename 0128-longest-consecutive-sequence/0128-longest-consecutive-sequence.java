class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< nums.length;i++)
        {
            set.add(nums[i]);
        }
        int maxlen = 0;
        
        for(int num: set)
        {
            
            if(set.contains(num-1)==false)
            {
                  int j = 1;
              
            int curr = num;
                while(set.contains(curr+1))
                {
                    curr+=1;
                    j+=1;

                }
                maxlen = Math.max(maxlen,j);
                
            }
            


        }
    return maxlen;
    }


}
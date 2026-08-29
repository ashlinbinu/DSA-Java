class Solution {
    public String[] largestString(int[] nums) {
        String[] ans = new String[nums.length];

        
        for(int i = 0; i< nums.length;i++)
            {
                
                StringBuilder s = new StringBuilder();

                
                int z = nums[i]>>25;
                for(int k = 0; k<z;k++)
                    {
                        s.append('z');
                    }
                
                int remaining= nums[i]&((1<<25)-1);
                for(int bit = 24; bit>=0;bit--)
                    {
                        if((remaining&(1<<bit))!=0)
                        {
                            s.append((char)('a'+bit));
                        }
                    }
                ans[i] = s.toString();
                
    }
        return ans;
    }
}
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd = Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        int[] nums2 = new int[nums1.length];
        for(int i = 0 ; i< nums1.length;i++)
        {
            if(nums1[i]%2 ==1)
            { minodd = Math.min(minodd,nums1[i]);}
            
            if(nums1[i]%2 ==0)
            { mineven = Math.min(mineven,nums1[i]);}
        }
        if(minodd<mineven)
    {
        for(int i = 0 ; i< nums1.length;i++)
            {
                if(nums1[i]%2 == 1)
                {
                    nums2[i] = nums1[i];
                }
                else
                if(nums1[i] - minodd>=1)
                {
                    nums2[i] = nums1[i] - minodd;
                }
                else
                {
                    return false;
                }
            }
    }
        
        else 
        {
            for(int i = 0 ; i< nums1.length;i++)
            {
                if(nums1[i]%2 == 0)
                {
                    nums2[i] = nums1[i];
                }
                else
                if(nums1[i] - minodd>=1)
                {
                    nums2[i] = nums1[i] - minodd;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
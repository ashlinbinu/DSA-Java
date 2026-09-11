class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int prod= 1;
        for(int i = 0; i< nums.length;i++)
        {
            prod*=nums[i];
        }
        if(prod>0)
        {
            return prod;
        }
       int minprod =nums[0];
       int maxprod = nums[0];
       int res = nums[0];
       for(int i = 1; i<nums.length;i++)
       {
        if(nums[i]<0)
        {
            int temp = maxprod;
            maxprod = minprod;
            minprod= temp;
        }

        maxprod = Math.max(nums[i],maxprod*nums[i]);
        minprod = Math.min(nums[i],minprod*nums[i]);

        res = Math.max(res,maxprod);
        
       }


        
       //if(Math.max(product,product2) ==1 && (product == 0|| product2 == 0)){return 0;}
        return res;

    }
}
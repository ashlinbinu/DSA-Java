class Solution {
    public int maxProduct(int[] nums) {
       int n1 = -1;                        //34 54 54 54 54 125
        int n2 = -1;                        //-1 34 34 54 54 54
                              //-1 -1 23 34 54 54

        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]>n1)
            {
               
                n2 = Math.max(n1,n2);
                n1=nums[i];
                              
                
            }
            else if(nums[i]>n2)
            {
               
               
                n2=nums[i];
            }
            
        }
        return (n1-1)*(n2-1); 
    }
}
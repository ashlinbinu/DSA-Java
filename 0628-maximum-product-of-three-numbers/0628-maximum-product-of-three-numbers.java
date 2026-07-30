class Solution {
    public int maximumProduct(int[] nums) {//[-1,-2,-3]
        int n1 = Integer.MIN_VALUE;                        //M -1 -2 -3
        int n2 = Integer.MIN_VALUE;                        //M MM -1 
        int n3 = Integer.MIN_VALUE; 
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;                       //M MM MM
        int sign = 0;
        for(int i = 0; i<nums.length;i++)
        {
            
            int a = nums[i];

            
            if(a>n1)
            {
                n3 = Math.max(n3,n2);
                n2 = Math.max(n1,n2);
                n1=a;
               
                              
                
            }
            else if(a>n2)
            {
                n3 = Math.max(n3,n2);
               
                n2=a;
            }
            else if(a>n3)
            {
                n3=a;
            }

            if(a<min1)
            {
                min2 = Math.min(min1,min2);
                min1 = a;
            }
            else if(a< min2)
            {
                min2 = a;
            }
        }
        return Math.max(n1*n2*n3,n1*min1*min2);
        
        
    }
}
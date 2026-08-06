class Solution {
    public int findGCD(int[] nums) {
        int maxm = nums[0];
        int minm = nums[0];

        for(int n: nums)
        {
            if(n>maxm)
            {
                maxm=n;
            }
            if(n<minm)
            {
                minm = n;
            }
        }
        return gcd(maxm,minm);
    }

    public int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }

        return gcd(b%a,a);
    }
}
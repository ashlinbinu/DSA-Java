class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int sum = 0;

        int n2 = n;

        while(n>0)
        {
            prod*= n%10;
            sum+=n%10;
            n/=10;
        }

        return ((n2%(prod+sum)) == 0);
    }
}
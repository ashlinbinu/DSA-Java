class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = (int)Math.pow(n,2);
        int b = (int)Math.pow(n,2)+n;
        return gcd(b,a%b);
    }
    public int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else return gcd(b,a%b);
    }

}
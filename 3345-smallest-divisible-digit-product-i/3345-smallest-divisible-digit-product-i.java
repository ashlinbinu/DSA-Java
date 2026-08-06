class Solution {
    public int smallestNumber(int n, int t) {
        int ans = n;
        while(n<=100)
        {
            int pro  = 1;
            int ans2 = ans;
            while(ans2>0)
            {
                pro*=ans2%10;
                ans2/=10;
            }
            if(pro%t == 0)
            {
                break;
            }
            
            ans++;
        }
       return ans;
    }
}
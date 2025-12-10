class Solution {
    public int countTriples(int n) {
        int c = 0;
        for( int i = 1; i<=n ; i++)
        {
            for(int j = 1; j<=n;j++)
            {
                int x = i*i +j*j;
                if((int)Math.sqrt(x) == Math.sqrt(x))
                {
                    if((int)Math.sqrt(x)<=n)
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
class Solution {
    public long sumAndMultiply(int n) {
        if (n ==0) return 0L;
        int m = n;
        long concatenatedNum = 0;
        long placeValue = 1;
        int sum = 0;
        while(m>0)
        {
            int x = (int)m %10;
            m= m/10;
            sum+=x;
            if(x!=0)
            {concatenatedNum += x * placeValue;
                placeValue *= 10;}

        }
        
        return concatenatedNum*sum;
    }
}
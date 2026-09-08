class Solution {
    public int countCommas(int n) {
        if(n<1000)
        {return 0;}

        int count = 0;
        if(n>=1000)
        {
            if(n<=100000)
            {
                count+=1+(n-1000);
            }
            
        }
       
        return count;
    }
}
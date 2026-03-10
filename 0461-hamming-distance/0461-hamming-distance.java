class Solution {
    public int hammingDistance(int x, int y) {
        int count1=0;
        
        int i = 1;
        while(x>0 || y>0)
        {
            if((x&1) != (y&1))
            {
                count1++;
            }
            x >>=1;
            y >>=1;
            i++;

        }
       
        return count1;
    }
}
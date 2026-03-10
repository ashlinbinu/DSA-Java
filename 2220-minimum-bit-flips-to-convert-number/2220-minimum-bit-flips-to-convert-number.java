class Solution {
    public int minBitFlips(int start, int goal) {
         int count1=0;
        
        int d = start^goal;
        while(d!=0)
        {
            d = d&(d-1);
            count1++;

        }
       
        return count1;
    }
}
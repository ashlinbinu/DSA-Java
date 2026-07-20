class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev0count = 0;
        if (n <= 0) return true;
        for(int i = 0; i<flowerbed.length;i++)
        {
            
            if(flowerbed[i]==1)
            {
                prev0count=0;
            }
            else if(flowerbed[i]==0)
            {
                if (i == 0) {
                    if (flowerbed.length == 1 || flowerbed[1] == 0) {
                        n--;
                        prev0count = 0; // count as planted
                        if (n <= 0) return true;
                    } else {
                        prev0count = 1;
                    }}
                else if(prev0count == 0)
                {
                    prev0count= 1;
                }
                else
                {
                    if(i+1==flowerbed.length || flowerbed[i+1]!=1)
                    {n--;
                    prev0count = 0;
                    if(n<=0)
                    {
                        return true;
                    }}
                    
                    
                }
            }
        }
        return n<=0;
        
    }
}
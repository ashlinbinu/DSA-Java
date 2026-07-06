class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tens = 0;
        int fives = 0;
        int twenties=0;
        for( int bill: bills)
        {
            if(bill==5)
            {
                fives++;
            }
            else if(bill == 10)
            {
                if(fives == 0) return false;
                tens++;
                fives--;
            }
            else if(bill == 20)
            {
                
                if( fives>=1 && tens>=1)
                {
                    tens--;
                    fives--;
                }
                else if(fives>=3)
                {fives-=3;}

                else return false;
            }
        }
        return true;
    }
}
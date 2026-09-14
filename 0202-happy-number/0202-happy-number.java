class Solution {
    public boolean isHappy(int n) {
        int num = n;
        
        while(true)
        {int newnum =0;
            while(num>0)

            {
                newnum+=(num%10)*(num%10);
                num/=10;
            }
            if(newnum == 1 || newnum == 7)
            {
                return true;
            }
            if(newnum>=0 && newnum<=9)
            {
                return false;
            }
            num = newnum;
            
        }
       // return false;
    }
}
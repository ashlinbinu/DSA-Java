class Solution {
    public int maxProduct(int n) {//1030
        int max1 = -1;            //1212  MAX1 9 MAX2 6
        int max2 = -1;

        while(n>0)
        {
            int x = n%10;//0

            if(x>=max1)
            {
                max2 = Math.max(max2,max1);//-1
                max1 = x;//0
                
            }
            else{
                max2 = Math.max(x,max2);
            }
           
            n= n/10;//103
            int y = n%10;//3

            if(y>=max2)//T
            {
                max1 = Math.max(max2,max1);
                max2 = y;//MAX2 = 
               
                
            }
            else
            {
                max1 = Math.max(y,max1);
            }
            n = n/10;//7


        }
        return max1*max2;
    }
}
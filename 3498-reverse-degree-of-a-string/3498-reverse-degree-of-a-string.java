class Solution {
    public int reverseDegree(String s) {
       
int sum =0;
int k =1;
        for(int i = 0; i< s.length();i++)
        {
            int diff = (int)s.charAt(i)-97;
            sum+=k*((int)s.charAt(i)-71-2*diff);
            k++;
        }
        return sum;

        //abczaza a-> 97 -> 26-0 -- 71+26+
    }
}
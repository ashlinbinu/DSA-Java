class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans;
        if(digits[digits.length-1] == 9)
        {
            ans = new int[digits.length+1];
            
            int carry = 1;
            for(int i = digits.length;i>0;i--)
            {
                ans[i] = (digits[i-1]+carry)%10;
                carry = (digits[i-1]+carry)/10;
            }
            if(carry ==1)
            {
                ans[0] = 1;
            }
            else if(carry == 0)
            {
                for(int i = 1; i<digits.length+1;i++)
                {
                    digits[i-1] = ans[i];
                }
                return digits;
            }
            
        }
        else
        {
            digits[digits.length-1]++;
            return digits;
        }
        return ans;
    }
}
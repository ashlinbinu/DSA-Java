class Solution {
  public boolean isPalindrome(String s) {
        String str ="";
        for(int i =0; i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                str+=s.charAt(i);
            }
        }
        String str2 = str.toLowerCase();
        for(int j = 0;j< str2.length();j++)
        {
            if(str2.charAt(j)!=str2.charAt(str2.length()-j-1))
           
            {
                return false;
                
            }

        }
        return true;
    }
}
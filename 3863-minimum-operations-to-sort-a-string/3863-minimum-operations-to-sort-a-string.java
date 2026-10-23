class Solution {
    public int minOperations(String s) {
        int[] str = new int[s.length()];
        for(int i = 0; i< s.length();i++)
        {
            str[i] = (int)s.charAt(i)-'a';
        }
        
        //sorted
        int x= -1;
        for(int i = 1; i<s.length();i++)
        {
            if(str[i]<str[i-1])
            {
                x= 1;
                break;
            }

        }
        if(x == -1){return 0;}

        //min and max 
        int min = 0;
        int max = 0;
        for(int i = 0; i< str.length;i++)
        {
            if(str[min]>str[i])
            {
                min= i;
            }
            if(str[max]<=str[i])
            {
                max = i;
            }
        }
       
        if(min == 0){return 1;}
        if(max == str.length-1){
            return 1;
        }
        if(max == 0 && min == str.length -1)
        {
            if(str.length == 2){return -1;}
            else
            {
                return 3;
            }
        }

        
        return 2;        
    }
}
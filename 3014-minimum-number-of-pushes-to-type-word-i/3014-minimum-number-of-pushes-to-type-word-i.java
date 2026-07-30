class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int output = 0;
        for(int i = 1; i<=len;i++)
        {
            if(i>0)
            {

            }
        }

        if(len>=24)
        {
            output += (len-24)*4;
            len = 24;
        }
        if(len>=16)
        {
            output+=(len-16) *3;
            len = 16;
        }
        if(len>= 8)
        {
            output+=(len-8) *2;
            len = 8;
        }
        if(len>=0)
        {
            output+=(len) *1;
            len = 0;
        }

        return output;
    }
}
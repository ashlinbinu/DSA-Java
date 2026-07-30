class Solution {
    public int minimumPushes(String word) {
        int len = word.length();//22
        int output = 0;
        int rem = len%8;//2
        int grp = len/8;//2 
        int i = 0;
        for(i = 1; i<=grp;i++)
        {
            output+=8*i;//8+16
        }

        return output+(grp+1)*rem;//24+3*2
    }
}
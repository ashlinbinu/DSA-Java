class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str = "";
        for(int i = 0; i< words.length;i++)
        {
            long x = 0;
            for(int j = 0;j<words[i].length();j++)
            {
                x+=weights[(int)words[i].charAt(j)-97];
            }
            str += (char) ('a' + (25 - (x % 26)) % 26);
        }
        return str;
    }
}
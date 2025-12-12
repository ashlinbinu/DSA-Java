class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int i =0;
        while(i<strs[0].length())
        {
            
            int j = 0;
            while(j<strs.length)
            {
                if (strs[j].length() < i+1) {
    return str.toString();  
}
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
    return str.toString();
}
                else if(j== strs.length-1)
                {
                    str.append(strs[0].charAt(i));
                }
                j++;
                
            }
            i++;
           
        }
        return str.toString();
    }
}
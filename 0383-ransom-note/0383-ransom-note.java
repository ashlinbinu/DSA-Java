class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magchar = new ArrayList<>();
        for(int i =0;i<magazine.length();i++)
        {
            magchar.add(magazine.charAt(i));
        }
        for(int i =0;i<ransomNote.length();i++)
        {
            if(magchar.contains(ransomNote.charAt(i)))
            {
                magchar.remove(magchar.indexOf(ransomNote.charAt(i)));
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
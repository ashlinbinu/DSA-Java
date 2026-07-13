import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     if(strs.length ==0 || strs == null) return new ArrayList<>();

    HashMap<String, List<String>> frequencymap = new HashMap<>();
    for(int i = 0; i<strs.length;i++)
    {
        String freqstring = getFrequencyString(strs[i]);

        if(frequencymap.containsKey(freqstring))
        {
            frequencymap.get(freqstring).add(strs[i]);
        }
        else
        {
            ArrayList<String> newlist = new ArrayList<>();
            newlist.add(strs[i]);
            frequencymap.put(freqstring,newlist);
        }
    }
    return new ArrayList<>(frequencymap.values());



         }

    public String getFrequencyString(String s)
    {
        int[] alphabets = new int[26];
        for(int i = 0; i<s.length();i++)
        {
            alphabets[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char ini = 'a';
        for (int i = 0; i < 26; i++) {
        if (alphabets[i] > 0) {
            sb.append((char)('a' + i));
            sb.append(alphabets[i]);
        }
    }
        return sb.toString();
    }
}
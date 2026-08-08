class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> ordermap = new HashMap<>();
        for(int i = 0; i< order.length();i++)
        {
            ordermap.put(order.charAt(i),i);
            
        }

        

        for(int i = 0 ;i< words.length-1;i++)
        {
            String s1 = words[i];
            String s2 = words[i+1];
            if (s1.length() > s2.length() && s1.startsWith(s2)) {
                return false;
            }
            for(int j = 0; j< Math.min(s1.length(),s2.length());j++)
            {
                char j1 = s1.charAt(j);
                char j2 = s2.charAt(j);
                if(ordermap.get(j1) < ordermap.get(j2))
                {
                    break;
                }
                else  if(ordermap.get(j1) > ordermap.get(j2))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
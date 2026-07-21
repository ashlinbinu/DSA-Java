class Solution {
    public List<Integer> partitionLabels(String s) {
    //     HashMap<Character,List<Integer>> map = new HashMap<>();
        
    //     for(int i = 0; i<s.length();i++)
    //     {
    //         if(!map.containsKey(s.charAt(i)))
    //         {
    //             List<Integer> list = new ArrayList<>();
    //             list.add(i);
    //             list.add(i);
    //             map.put(s.charAt(i),list);
    //         }
    //         map.get(s.charAt(i)).set(1,i);
            
    //     }

    //     ArrayList<List<Integer>> intervallist = new ArrayList<>(map.values());
    //     intervallist.sort((a,b)->Integer.compare(a.get(0),b.get(0)));
    //     int firstindex = intervallist.get(0).get(0);
    //     int lastindex = intervallist.get(0).get(1);
    //     List<Integer> output = new ArrayList<>();
    //     for(int i = 1; i<intervallist.size();i++)
    //     {
    //         if(intervallist.get(i).get(0)>lastindex)
    //         {
    //             output.add(lastindex-firstindex+1);
    //             firstindex = intervallist.get(i).get(0);
    //             lastindex = intervallist.get(i).get(1);
    //         }
    //         else
    //         {
    //             if(intervallist.get(i).get(1)>lastindex)
    //             {
    //                 lastindex = intervallist.get(i).get(1);
    //             }
    //         }

    //     }
    //     output.add(lastindex-firstindex+1);

    //     return output;
    //THE BELOW ONE IS NOT MY SOLUTION IT IS THE IDEAL SOLUTION OF TC OF O(N)
    int[] lastIndex = new int[26];
        
        // Step 1: Store the last occurrence index for every character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int start = 0;    // Start index of current partition
        int maxIndex = 0; // Furthest required end index for current partition
        
        // Step 2: Iterate through string and form partitions
        for (int i = 0; i < s.length(); i++) {
            // Expand partition boundary if current char appears further right
            maxIndex = Math.max(maxIndex, lastIndex[s.charAt(i) - 'a']);
            
            // If current index catches up to maxIndex, cut the partition here!
            if (i == maxIndex) {
                result.add(i - start + 1); // Length of this partition
                start = i + 1;             // Move start pointer to next partition
            }
        }
        return result;
        }
}
    

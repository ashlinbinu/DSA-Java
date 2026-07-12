import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2= arr.clone();
        Arrays.sort(arr2);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank =1;
        for(int i = 0; i<arr.length;i++)
        {
            if(!map.containsKey(arr2[i]))
            {
                map.put(arr2[i],rank);
                rank++;
            }


            
        }
        int[] ranks = new int[arr.length];
for(int i = 0; i<arr.length;i++)
        {
            ranks[i] = map.get(arr[i]);

       
        
    }
    return ranks;
      }
}
    

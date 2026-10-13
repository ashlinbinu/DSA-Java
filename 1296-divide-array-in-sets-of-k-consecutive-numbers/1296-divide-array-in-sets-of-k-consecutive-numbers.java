class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)
        {
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<int[]> list = new ArrayList<>();
        for(int i:map.keySet())
        {
            list.add(new int[]{i,map.get(i)});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
        {
            return a[0]-b[0];
        });
        for(int i =0; i<list.size();i++)
        {
            pq.offer(list.get(i));
        }

        while(!pq.isEmpty())
        {
            if (pq.size() < k) {
    return false;
}
            int[] check= new int[k];
            int[] freq = new int[k];
            for(int i = 0; i< k;i++)
            {
                int[] currentEntry = pq.poll();
                check[i] = currentEntry[0];
                freq[i] = currentEntry[1];


            }
            
            for(int i = 0; i<k;i++)
            {
                if(check[i]!=check[0]+i)
                {
                    return false;
                }
                freq[i]--;
            }
            for(int i= 0; i< k;i++)
            {
                if(freq[i]>0)
                {
                    pq.offer(new int[]{check[i],freq[i]});
                }
                else
                {
                    map.remove(check[i]);
                }
            }


        }
        return true;
    }
}
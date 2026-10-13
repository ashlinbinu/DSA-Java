class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        {
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< hand.length;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
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
            if (pq.size() < groupSize) {
    return false;
}
            int[] check= new int[groupSize];
            int[] freq = new int[groupSize];
            for(int i = 0; i< groupSize;i++)
            {
                int[] currentEntry = pq.poll();
                check[i] = currentEntry[0];
                freq[i] = currentEntry[1];


            }
            
            for(int i = 0; i<groupSize;i++)
            {
                if(check[i]!=check[0]+i)
                {
                    return false;
                }
                freq[i]--;
            }
            for(int i= 0; i< groupSize;i++)
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
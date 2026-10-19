class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();
        set.add(0);
        q.offer(0);
        while(!q.isEmpty())
        {
            int x = q.poll();
            for(int n:rooms.get(x))
                {
                    if(!set.contains(n))
                    {
                        set.add(n);

                    q.offer(n);
                    }
                    
                }
            
            
        }
        if(set.size()==rooms.size())
        {
            return true;
        }
        return false;
    }
}
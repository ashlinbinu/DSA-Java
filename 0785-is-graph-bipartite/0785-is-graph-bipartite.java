class Solution {
    public boolean isBipartite(int[][] graph) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(graph.length, 2));
        
        for(int i = 0; i<graph.length;i++)
        {
            if(list.get(i) == 2)
            {
                
                boolean x = BFS(i,graph,list);
                if(x == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean BFS(int i ,int[][] graph,List<Integer> list)
    {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        list.set(i,0);
        while(!q.isEmpty())
        {int curr = q.poll();
        
        
        for(int neighbors: graph[curr])
        {
            if(list.get(neighbors)==2)
            {
                list.set(neighbors,1-list.get(curr));
                q.offer(neighbors);
            }
            else if(list.get(neighbors)==list.get(curr))
            {
                return false;
            }
            

        }}
        return true;
    }
}
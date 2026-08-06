class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] outdegree = new int[graph.length];
        
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> oppadj = new ArrayList<>();

        for(int i = 0 ; i< graph.length;i++)
    {
        outdegree[i] = graph[i].length;
        if(outdegree[i]  == 0)
        {
            q.offer(i);
            
        }
        oppadj.add(new ArrayList<>());

    }
       for(int i = 0 ; i< graph.length;i++)
    {
        
         for(int j = 0 ; j< graph[i].length;j++)
         {
         
         oppadj.get(graph[i][j]).add(i);}

    }

   

    
    while(!q.isEmpty())
    {
        List<Integer> sublist = oppadj.get(q.poll());
        for(int i = 0; i<sublist.size();i++)
        {
            outdegree[sublist.get(i)]--;
            if(outdegree[sublist.get(i)]==0)
            {
                q.offer(sublist.get(i));
            }
        }
    }

    for(int i = 0 ; i< outdegree.length;i++)
    {
        if(outdegree[i] == 0)
        {
            ans.add(i);
        }
    }
return ans;

        
    }
}
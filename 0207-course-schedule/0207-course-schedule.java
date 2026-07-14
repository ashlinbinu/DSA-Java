class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
         for(int i = 0; i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] inDegree= new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<adj.size();i++)
        {
            List<Integer> list = adj.get(i);
            for(int j = 0; j<list.size();j++)
            {
                inDegree[list.get(j)]++;
            }



        }

        for(int i = 0; i<inDegree.length;i++)
        {
            if(inDegree[i]==0) q.offer(i);
        }
        while(!q.isEmpty())
        {
            int n = q.poll();
             List<Integer> list2 = adj.get(n);
              for(int j = 0; j<list2.size();j++)
            {
                inDegree[list2.get(j)]--;
                if(inDegree[list2.get(j)]==0)
                {
                    q.offer(list2.get(j));
                }
            }




        }
        for(int i = 0; i<inDegree.length;i++)
        {
            if(inDegree[i]!=0) return false;
        }
        return true;
        

    }
}
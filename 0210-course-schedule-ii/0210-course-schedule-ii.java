class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree= new int[numCourses];
        int[] ans = new int[numCourses];
        Arrays.fill(ans,-1);
        for(int i = 0 ; i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i< prerequisites.length;i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inDegree[prerequisites[i][0]]++;
        }


       
        Queue<Integer> q = new ArrayDeque<>();
        
       int a = 0;

       for(int i = 0; i<inDegree.length;i++)
       {
        if(inDegree[i] == 0)
        {
            q.offer(i);
            ans[a] = i;
            a++;
        }
       }

       while(!q.isEmpty())
       {
            int n = q.poll();

            for (int neighbor : adj.get(n)) {
    if (--inDegree[neighbor] == 0) {
        q.offer(neighbor);
        ans[a++] = neighbor;
    }
}
       }
        if (a != numCourses) return new int[]{};

        return ans;
}
}
    

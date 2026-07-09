class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
       DSU dsu = new DSU(n);
for(int i = 1;i<n;i++)
{
    if(nums[i]-nums[i-1]<=maxDiff)
    {
        dsu.union(i,i-1);
    }
}
        boolean[] output = new boolean[queries.length];
        for(int i = 0; i<queries.length;i++)
        {
            int low = queries[i][0];
            int high = queries[i][1];

           output[i] = (dsu.find(low)==dsu.find(high)); 
        }
        
        return output;
    }
    class DSU{
    int[] parent;
    public DSU(int n)
    {
        parent = new int[n];
        for(int i = 0; i<n;i++)
        {
            parent[i] = i;
        }

    }

    public int find(int i)
    {
        if(parent[i] == i)
        {return i;}
        else{
            return parent[i] = find(parent[i]);
        }
    }

    public void union(int i ,int j)
    {
        int irep = find(i);
        int jrep=find(j);
        if(irep!=jrep){
        parent[jrep] = irep;}
    }
}


}
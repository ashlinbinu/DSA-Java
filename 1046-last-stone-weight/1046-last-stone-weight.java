class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> stonelist = new ArrayList<>();
        if(stones.length == 0) return 0;
        else if(stones.length == 1) return stones[0];

        for(int i =0; i<stones.length;i++)
        {
            stonelist.add(stones[i]);
        }
        
        while(stonelist.size()>=2){
        int x = maxheap(stonelist);
        int y = maxheap(stonelist);
        if(x != y)
        {stonelist.add(Math.abs(x - y));}
        }
        if(stonelist.size()== 0)
        {
            return 0;
        }
        else
        {
            return stonelist.get(0);
        }
    }

    public int maxheap(List<Integer> stonelist)
    {
        int leafstart = (int)Math.floor(stonelist.size()/2);
        for(int i = leafstart-1;i>=0;i--)
        {
            int lc =0;
            int rc =0;
            if(2*i+1<stonelist.size() && stonelist.get(2*i+1)!=0)
            {
                lc = stonelist.get(2*i+1);
            }
            if(2*i+2<stonelist.size() && stonelist.get(2*i+2)!=0)
            {
                rc = stonelist.get(2*i+2);
            }
            int root= stonelist.get(i);
            int maxm = Math.max(lc,rc);
            if(maxm<root)
            {}
            else if(maxm == lc)
            {
                stonelist.set(2*i+1,root);
                stonelist.set(i,lc);
            }
            else if(maxm == rc)
            {
                stonelist.set(2*i+2,root);
                stonelist.set(i,rc);
            }

        }
        int ans = stonelist.remove(0);
        return ans;
    }

}
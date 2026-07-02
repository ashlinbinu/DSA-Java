class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] maxhealthatcell = new int[m][n];
        for(int[] row :maxhealthatcell){
            Arrays.fill(row,-1);
        }

        Deque<int[]> deque = new ArrayDeque<>();

        int starthealth = health -grid.get(0).get(0);
        if(starthealth == 0) return false;

        maxhealthatcell[0][0] = starthealth;
        deque.offerFirst(new int[]{0,0});

        while(!deque.isEmpty())
        {
            int[] curr = deque.pollFirst();
            int r = curr[0];
            int c = curr[1];
            int currenthealth = maxhealthatcell[r][c];

            if(r == m-1 && c == n-1 && currenthealth >=1)
            {
                return true;
            }

            for(int[] dir:dirs)
            {
                int nr = r+dir[0];
                int nc = c+dir[1];

                if(nr>=0 && nr<m && nc>=0 && nc <n)
                {
                    int nextHealth = currenthealth- grid.get(nr).get(nc);
                    if(nextHealth >=1 && nextHealth> maxhealthatcell[nr][nc])
                    {
                        maxhealthatcell[nr][nc] = nextHealth
;
if(grid.get(nr).get(nc) ==0)
{
    deque.offerFirst(new int[]{nr,nc});

}   
else{
    deque.offerLast(new int[]{nr,nc});
}                 }
                }
            }

        }
        return false;
    }
}
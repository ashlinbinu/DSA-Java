class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        
        int goodcount = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q =new LinkedList<>();
        for(int i = 0; i<m;i++)
        {
            for(int j = 0; j<n;j++)
            {
                if(grid[i][j]== 2)
                {
                    
                    q.offer(new int[]{i,j});
                    
                    
                }
                if(grid[i][j] ==1)
                {
                    goodcount++;//6
                }

            }
        }//O(N2)

        if(goodcount == 0){return 0;}//fast exit
        int[][] dirs ={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty() && goodcount>0)
        {
            int size = q.size();
            time++;
            for(int x = 0; x<size;x++)
            {
                int[] curr =q.poll();
                int i = curr[0];
                int j =curr[1];

                for(int[] dir : dirs)
                {
                    int r= dir[0]+i;
                    int c = dir[1]+j;

                    if(r>=0 && c>=0 && r<m && c<n && grid[r][c] == 1)
                    {
                        grid[r][c] = 2;
                        q.offer(new int[]{r,c});
                        goodcount--;
                    }
                }
                
            }  
        }
        if(goodcount != 0)
                {
                    return -1;
                }
        return time;
    }

  
}
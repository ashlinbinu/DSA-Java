class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        /*

        1 0 0 
        1 1 0
        1 1 0

        */
int pathlen = -1;
Queue<int[]> q= new ArrayDeque<>();

if(grid.length == 1 && grid[0][0] == 0 )
{
    return 1;
}

if(grid[0][0] != 0 || grid[grid.length-1][grid.length-1] == 1){
    return -1;
}
else
{
    q.offer(new int[]{0,0});
    pathlen = 1;
    grid[0][0] = 1;
    
}
       

        while(!q.isEmpty())
        {
            
            int n = q.size();

            for(int i = 0; i< n ; i++)
            {

                int[] curr = q.poll();
                if(curr[0] ==grid.length-1 && curr[1] == grid.length-1)
                {
                    return pathlen;
                }
                int a = curr[0];
                int b = curr[1];
               grid[a][b] = 1;

               int[][] directions = {
    {-1, -1}, {-1, 0}, {-1, 1},
    { 0, -1},          { 0, 1},
    { 1, -1}, { 1, 0}, { 1, 1}
};
            for(int[] dir: directions)
            {
                int nr = dir[0]+a;
                int nc = dir[1]+b;

                if(nr>=0 && nc>=0 && nr< grid.length && nc < grid.length  && grid[nr][nc] == 0)
                {
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc] = 1;
                }
            }

                
            }
            pathlen++;
        }
        return -1;
    }
}
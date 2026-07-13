class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0 ||grid == null) return 0;
        int islandcount = 0;
        for(int i = 0; i<grid.length;i++)
        {
            for(int j = 0; j<grid[0].length;j++)
            {
                if(grid[i][j] =='1')
                {
                    islandcount++;
                    dfs(grid,i,j);
                }
            }
        }
        return islandcount;
    }
    public void dfs(char[][] grid, int row, int col)
    {
        int m = grid.length;
        int n = grid[0].length;
        if(row<0|| row>=m ||col<0||col>=n||grid[row][col]!='1') return;
        grid[row][col] = '0';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
}
class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;

        int m = grid.length;
        int n = grid[0].length;

        for(int i =0; i<m;i++)
        {
            for(int j = 0; j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    count+=4;
                    if(i<m-1 && j<n && grid[i+1][j] ==1)
        {
            count-=1;
            }
        if(i<m && j<n-1&& grid[i][j+1] ==1)
        {
            count-=1;}
        if(i>0 && j<n && grid[i-1][j] ==1)
        {
            count-=1;}
        if(i<m && j>0&& grid[i][j-1] ==1)
        {
            count-=1;}
                }
            }
        } 
        return count;
    }

    

}
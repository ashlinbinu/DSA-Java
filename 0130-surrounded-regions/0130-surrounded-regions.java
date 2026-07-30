class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] safe = new int[m][n];
        for (int j = 0; j < n; j++) {
    if (board[0][j] == 'O' && safe[0][j] == 0){ 
        safe[0][j] = -1;
        dfs(board, 0, j, safe);}
    if (board[m - 1][j] == 'O' && safe[m - 1][j] == 0) {
        safe[m-1][j] = -1;
        dfs(board, m - 1, j, safe);}
}


for (int i = 0; i < m; i++) {
    if (board[i][0] == 'O' && safe[i][0] == 0) {
        safe[i][0] = -1;
        dfs(board, i, 0, safe);}
    if (board[i][n - 1] == 'O' && safe[i][n - 1] == 0) {
        safe[i][n-1] = -1;
        dfs(board, i, n - 1, safe);}
}
        
        for(int i = 0; i<m ; i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(safe[i][j] == 0 && board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
                
            }
            }

    }

    public void dfs(char[][] board, int i , int j,int[][] safe)
    {
        if(board[i][j] == 'X')
        {
            return;
        }

        

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int[] dir: dirs)
        {
            int nr = dir[0]+i;
            int nc = dir[1]+j;

            if(nr>=0 && nc>=0 && nr<board.length && nc <board[0].length && board[nr][nc] =='O' && safe[nr][nc]==0)
            {
                
                safe[nr][nc] = -1;
                dfs(board,nr,nc,safe);
                

            }
           
        }
    }
    
    
}
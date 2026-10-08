class Solution {
    public boolean isValidSudoku(char[][] board) {
        //invalid rows
        for(int i = 0; i< 9;i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(set.contains(board[i][j]))
                    {
                        return false;
                    }
                    else
                    {
                        set.add(board[i][j]);
                    }
                } 
            }
        }

        //invalid columns
        for(int i = 0; i< 9;i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    if(set.contains(board[j][i]))
                    {
                        return false;
                    }
                    else
                    {
                        set.add(board[j][i]);
                    }
                } 
            }
        }

        //invalid square
        for(int i = 0; i< 9;i++)
        {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
        int r = (i / 3) * 3 + (j / 3);
        int c = (i % 3) * 3 + (j % 3);
        
        if (board[r][c] != '.') {
            if (set.contains(board[r][c])) {
                return false;
            }
            set.add(board[r][c]);
        }
    }

        }
        return true;
    }
}
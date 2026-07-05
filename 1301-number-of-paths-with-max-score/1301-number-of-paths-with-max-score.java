import java.util.*;

class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1_000_000_007;
        
        // dp[i][j][0] stores the max score at cell (i, j)
        // dp[i][j][1] stores the number of paths achieving that max score
        int[][][] dp = new int[n][n][2];
        
        // Base case: Start cell 'S' has a score of 0 and 1 valid path
        dp[n - 1][n - 1][0] = 0;
        dp[n - 1][n - 1][1] = 1;
        
        // Iterate backwards from the bottom-right to the top-left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Skip the start cell since it's already initialized
                if (i == n - 1 && j == n - 1) continue;
                
                // Obstacles cannot be stepped on or traversed through
                if (board.get(i).charAt(j) == 'X') {
                    dp[i][j][0] = -1; 
                    continue;
                }
                
                int maxScore = -1;
                int paths = 0;
                
                // Check the three incoming directions (down, right, down-right)
                int[][] directions = {{i + 1, j}, {i, j + 1}, {i + 1, j + 1}};
                
                for (int[] dir : directions) {
                    int ni = dir[0], nj = dir[1];
                    
                    // Verify boundaries and if the cell is reachable
                    if (ni < n && nj < n && dp[ni][nj][0] != -1) {
                        if (dp[ni][nj][0] > maxScore) {
                            maxScore = dp[ni][nj][0];
                            paths = dp[ni][nj][1];
                        } else if (dp[ni][nj][0] == maxScore) {
                            paths = (paths + dp[ni][nj][1]) % MOD;
                        }
                    }
                }
                
                // If maxScore remains -1, this cell is unreachable
                if (maxScore == -1) {
                    dp[i][j][0] = -1;
                } else {
                    // 'E' has a value of 0, numeric characters have their actual digit value
                    char c = board.get(i).charAt(j);
                    int currentVal = (c == 'E') ? 0 : (c - '0');
                    
                    dp[i][j][0] = maxScore + currentVal;
                    dp[i][j][1] = paths;
                }
            }
        }
        
        // If the top-left cell 'E' is unreachable, return [0, 0]
        if (dp[0][0][0] == -1) {
            return new int[]{0, 0};
        }
        
        return new int[]{dp[0][0][0], dp[0][0][1]};
    }
}
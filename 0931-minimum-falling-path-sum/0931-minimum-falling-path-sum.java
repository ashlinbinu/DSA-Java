class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp= new int[matrix.length][matrix[0].length+1];
        for(int i = 0; i< matrix.length;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        //trying tabulation
        
        for(int position = 0; position<matrix[0].length;position++)
           {
            dp[0][position]= matrix[0][position];
           }  
    
        for(int i = 1; i<matrix.length;i++)
        {
           for(int position = 0; position<matrix[i].length;position++)
           {
            int minm = Integer.MAX_VALUE;
            if(position+1<matrix[i].length && position+1>=0)
            {
                minm = Math.min(matrix[i][position]+dp[i-1][position+1],minm);
            }
            
            if(position-1<matrix[i].length && position-1>=0)
            {
                minm = Math.min(matrix[i][position]+dp[i-1][position-1],minm);
            }
            
            if(position<matrix[i].length&& position>=0)
            {
                 minm = Math.min(matrix[i][position]+dp[i-1][position],minm);
            }
              dp[ i][position] = minm; 
           }
        }
        int minm1 = Integer.MAX_VALUE;
        for(int i = 0; i<matrix[0].length;i++)
        {
            minm1= Math.min(dp[matrix.length-1][i],minm1);
        }
        return minm1;

       
    }
}
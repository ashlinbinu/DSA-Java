class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return l;
        int i_max = matrix.length-1;
        int j_max = matrix[0].length-1;
        int i_min = 0;
        int j_min= 0;
        int i = 0;
        int j = 0;
        while(i_min <= i_max && j_min <= j_max)
        {
            for(int a = j_min;a<=j_max;a++)
                {
                    l.add(matrix[i_min][a]);
                    
                }
                i_min++;
                
            
            for(int a = i_min;a<=i_max;a++)
                {
                    l.add(matrix[a][j_max]);
                }
                j_max--;
               
            if (i_min <= i_max) {
                for (int a = j_max; a >= j_min; a--) {
                    l.add(matrix[i_max][a]);
                }
                i_max--;
            }
            if (j_min <= j_max) {
                for (int a = i_max; a >= i_min; a--) {
                    l.add(matrix[a][j_min]);
                }
                j_min++;
            }
               
           
        }
return l;
    }
}
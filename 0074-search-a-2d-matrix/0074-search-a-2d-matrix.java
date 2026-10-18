class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target)
            {
                break;
            }
            else if(matrix[mid][0]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        int l = 0;
        int h = matrix[0].length-1;
        int m = 0;

        while(l<=h)
        {
            m = l+(h-l)/2;
            if(matrix[mid][m] == target)
            {
                return true;
            }
            else if(matrix[mid][m]>target)
            {
                h = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return false;
    }
}
class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
       
       
       
       int i = 1;
       int count = 1;
       int arrowpos=points[0][1];
      while(i<points.length)
      {
        if(arrowpos>=points[i][0] && arrowpos<=points[i][1]){}
        else{
            arrowpos= points[i][1];
            count++;
        }
        i++;
      }
      return count;


    }
}
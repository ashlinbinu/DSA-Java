class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       Queue<int[]> q = new LinkedList<>();
       q.add(new int[]{sr,sc});
       int prevcolor = image[sr][sc];
       while(!q.isEmpty())
       {
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            
            if(prevcolor == color){return image;}
            if(image[row][col] == prevcolor)
            {
                image[row][col] = color;
                int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
                for(int[] dir:dirs)
                {
                    int nr = dir[0]+row;
                    int nc = dir[1]+col;

                    if(nr>=0 && nc>=0 && nr<image.length && nc<image[0].length && image[nr][nc] == prevcolor)
                    {
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
       }
       return image;
    }
}
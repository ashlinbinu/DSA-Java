class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<int[]> dp = new ArrayList<>();

        for(int i = 0; i< triangle.size();i++)
        {
            int[] n = new int[i+1];
            Arrays.fill(n,Integer.MAX_VALUE);
            dp.add(n);
           
        }
        int x = helper(0,0,dp,triangle);
        return (x==Integer.MAX_VALUE)? 0:x;
    }

    public int helper(int i ,int k, List<int[]> dp, List<List<Integer>> triangle)
    {
        if(i<0|| i>=dp.size() || k<0 || k>=dp.get(i).length){return Integer.MAX_VALUE;}
        if(dp.get(i)[k] != Integer.MAX_VALUE){
            return dp.get(i)[k];
        }
        if(i == dp.size()-1)
        {
            
                return triangle.get(i).get(k);
                
            
        }

        
        
        int points = Integer.MAX_VALUE;
        if(i+1>=0 && i+1<dp.size() && k+1>=0 && k+1<dp.get(i+1).length)
       {
        dp.get(i+1)[k+1]= helper(i+1,k+1,dp,triangle);
        points = Math.min(points,dp.get(i+1)[k+1]);
       } 
       if(i+1>=0 && i+1<dp.size() && k>=0 && k<dp.get(i+1).length)
       {
        dp.get(i+1)[k]= helper(i+1,k,dp,triangle);
        points = Math.min(points,dp.get(i+1)[k]);
       } 
       return dp.get(i)[k]= triangle.get(i).get(k)+ points;
    }
}
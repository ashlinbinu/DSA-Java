class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> output1 = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int i = 1;
        output1.add(intervals[0]);
        while(i<intervals.length)
        {
            if(output1.get(output1.size()-1)[1]>=intervals[i][0])
            {
                int x= output1.get(output1.size()-1)[0];
                int y = output1.get(output1.size()-1)[1];
                output1.remove(output1.size()-1);
                output1.add(new int[]{x,Math.max(y,intervals[i][1])});
                i++;
            }
            else{
                output1.add(new int[]{intervals[i][0],intervals[i][1]});
                i++;
            }
        }
        return output1.toArray(new int[output1.size()][]);

    }
}
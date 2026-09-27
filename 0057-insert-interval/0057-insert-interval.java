class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> output1 = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        for(int i= 0 ; i< intervals.length;i++)
        {
            if(intervals[i][1]<start)
            {
               
                output1.add(intervals[i]);
            }
            else if(intervals[i][0]>end)
            {
               
                output1.add(intervals[i]);
            }
            else {if(intervals[i][0]<=start && intervals[i][1]>=start)
            {
               
               start = intervals[i][0];
            }
            if(intervals[i][0]<=end && intervals[i][1]>=end)
            {
                end = intervals[i][1];
                
            }
            }

        }
        output1.add(new int[]{start,end});
        Collections.sort(output1,(a,b)->{return a[0]-b[0];});
        return output1.toArray(new int[output1.size()][]);

    }
}
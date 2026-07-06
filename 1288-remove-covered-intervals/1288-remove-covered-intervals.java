class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> {
    if (a[0] != b[0]) {
        return Integer.compare(a[0], b[0]);
    } else {
        return Integer.compare(b[1], a[1]);
    }
});


        int maxl = intervals[0][0];
        int maxr = intervals[0][1];

        int count = 1;
        
        int i = 1;
        

        while(i<intervals.length ){
            int l =intervals[i][0];
        int r = intervals[i][1];
        if(l>=maxl && r<=maxr)
        {
            count+=0;
        }
        else
        {
            count++;
            maxl = l;
            maxr=r;
        }
        i++;
        }

        return count;


    }
}
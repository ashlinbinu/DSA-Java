class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxelement(piles);

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int totalhrs = findhrs(piles, mid);

            if(totalhrs > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int maxelement(int[] piles) {
        int max = piles[0];
        for(int i = 1; i < piles.length; i++) {
            if(piles[i] > max) max = piles[i];
        }
        return max;
    }

    public int findhrs(int[] piles, int x) {
        int totalhrs = 0;
        for(int i = 0; i < piles.length; i++) {
            totalhrs += Math.ceil((double)piles[i] / x);
        }
        return totalhrs;
    }
}

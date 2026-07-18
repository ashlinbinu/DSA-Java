class Solution {
    public int hammingWeight(int n) {
        int[] binaryn = new int[32];
        int i =0;
        int count = 0;

        while(n>0)
        {
            int rem = n%2;
            n = n/2;
            binaryn[i] =rem;
            i++;
        }

        for(int j = 0; j<binaryn.length;j++)
        {
            count+=binaryn[j]&1;
        }
        return count;
    }
}
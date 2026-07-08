class Solution {//YOU DIDNT SOLVE THIS SO PLEASE COME BACK!!
    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        long MOD = 1000000007;
       long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] prefixNum = new long[m + 1];
        long[] prefixSum = new long[m + 1];
        int[] prefixCount = new int[m + 1];
        for (int i = 0; i < m; i++) {
            int digit = s.charAt(i) - '0';
            
            if (digit != 0) {
                prefixNum[i + 1] = (prefixNum[i] * 10 + digit) % MOD;
                prefixSum[i + 1] = prefixSum[i] + digit;
                prefixCount[i + 1] = prefixCount[i] + 1;
            } else {
                prefixNum[i + 1] = prefixNum[i];
                prefixSum[i + 1] = prefixSum[i];
                prefixCount[i + 1] = prefixCount[i];
            }
        }

        // 3. Process each query in O(1) time
        int[] output = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            // Get total non-zero digits in the range
            int count = prefixCount[r + 1] - prefixCount[l];
            
            if (count == 0) {
                output[i] = 0;
                continue;
            }

            // Extract the concatenated number x using math:
            // x = (prefixNum[r+1] - prefixNum[l] * 10^count) % MOD
            long x = (prefixNum[r + 1] - (prefixNum[l] * pow10[count]) % MOD + MOD) % MOD;
            
            // Extract the sum of digits
            long sum = prefixSum[r + 1] - prefixSum[l];

            // Calculate final answer for the query
            output[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return output;
    }
}
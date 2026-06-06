class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while(i<n && j<2*n && k<2*n)
        {
            arr[k] = nums[i];
            i++;
            k++;
            arr[k] = nums[j];
            j++;
            k++;
        }
        return arr;
    }
}
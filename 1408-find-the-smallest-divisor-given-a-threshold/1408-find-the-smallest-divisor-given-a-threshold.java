class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxm(nums);
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(sumfinder(nums, mid)<=threshold)
            {high = mid-1;}
            else
            {low = mid+1;}
        }
        return low;
    }
    public int sumfinder(int[] arr, int divisor)
    {int x = 0;
        for(int i = 0 ; i< arr.length;i++)
        {
            x+=(int) ((arr[i]+divisor-1)/divisor);

        }
        return x;
    }
    public int maxm(int[] arr)
{
    int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
}

}
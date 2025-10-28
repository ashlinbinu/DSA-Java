class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxm(weights);
        int high = sum(weights,0,weights.length);
        int ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(daysrequired(weights,mid)<=days)
            {
                ans = mid;
                high = mid-1;;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public int maxm(int[] arr)
{
    int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
}

    public int sum(int[] arr, int lowerlimit, int higherlimit)
    {
        int sum = 0;
        for(int i = lowerlimit;i<higherlimit;i++)
        {sum+=arr[i];}
        return sum;
    }
    //answer's range can be from the maxm number to the sum of the weights
    public int daysrequired(int[] arr, int day)
    {
        int dayctr = 0;
        int i =0;
        int sum=0;
        while(i<arr.length)
        {
            if(sum+arr[i]<= day)
            {
                sum+=arr[i];

            }
            else
            {
                dayctr++;
                sum=0;
                i--;//reversing the iteration
            }
            i++;
        }
        if(sum>0)
        {dayctr++;}
        return dayctr;
    }
}
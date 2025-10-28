class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int ans =-1;
        int low = minm(bloomDay);
        int high = maxm(bloomDay);
        while(low<=high)
        {
            int mid = low+ (high-low)/2;
            if (dayfinder(bloomDay,mid,m,k) ==true)
            {ans = mid;
                high = mid-1;}
            else
            {low = mid+1;}

        }
        return ans;
    
}

public int minm(int[] arr)
{
    int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
}

public int maxm(int[] arr)
{
    int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
}

public boolean dayfinder(int[] arr, int day , int m, int k )
{
    int finalb = 0;
    int counter = 0;
    for(int i = 0; i<arr.length;i++)
    {
        if(arr[i]<= day)
        {
            counter++;
        }
        else 
        {
            finalb += counter/k;
            counter = 0;
        }
    }
    finalb += counter/k;//IMPORTANT THIS IS NEEDED AS WITHOUT THIS THE FINAL COUNT OF BOUQUOTS WILL BE INCOMPLETE JUST A WAY OF MAKING SURE WE DIDNT MISS ON ANY BOUQUETS
    if(finalb>=m){return true;}
    return false;
}
}
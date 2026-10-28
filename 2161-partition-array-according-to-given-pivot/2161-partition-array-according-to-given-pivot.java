class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> less = new ArrayList<>();
       List<Integer> greater = new ArrayList<>();
       int equal = 0;
       for(int i = 0; i< nums.length;i++)
       {
        if(nums[i]<pivot)
        {
            less.add(nums[i]);
        }
        if(nums[i] == pivot)
        {
            equal++;
        }
        if(nums[i]>pivot)
        {
            greater.add(nums[i]);
        }
       }
        int j = 0;
        for(int i = 0; i<less.size();i++)
        {
            nums[j] = less.get(i);
            j++;
        }
        for(int i = 0;i<equal;i++)
        {
            nums[j] = pivot;
            j++;
        }
        for(int i =0;i<greater.size();i++)
        {
            nums[j] = greater.get(i);
            j++;
        }
       
       return nums;  }}
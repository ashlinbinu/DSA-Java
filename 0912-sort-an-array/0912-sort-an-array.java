class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = n/2-1;i>=0;i--){
            siftdown(nums,n,i);
        }
        for(int i = n-1;i>=0;i--){
            swap(nums,0,i);
            siftdown(nums, i,0);
        }
        return nums;
    }
    public void siftdown(int[] nums, int heapSize, int rootIndex)
    {
        
        int largest = rootIndex; // Assume the root is the largest for now
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // If the left child exists AND is bigger than our current largest
        if (leftChild < heapSize && nums[leftChild] > nums[largest]) {
            largest = leftChild;
        }

        // If the right child exists AND is bigger than our current largest
        if (rightChild < heapSize && nums[rightChild] > nums[largest]) {
            largest = rightChild;
        }

        if(largest!=rootIndex)
        {
            swap(nums,largest,rootIndex);
            siftdown(nums,heapSize,largest);
        }
        
    }
    public void swap(int[] nums,int i,int j)
    {
        int a = nums[i];
        int b = nums[j];
        nums[j] = a;
        nums[i] = b;
        
        
    }
}
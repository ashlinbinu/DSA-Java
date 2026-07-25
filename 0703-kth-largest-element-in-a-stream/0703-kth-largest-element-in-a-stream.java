class KthLargest {
    int k ;
    int[] nums;
    PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)->Integer.compare(a,b));
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums= nums;
        for(int i= 0; i<nums.length;i++)
        {
            minheap.offer(nums[i]);//  4 5 8
        }
        while(minheap.size()>k){
            minheap.poll();
        }
    }
    
    public int add(int val) {
         minheap.offer(val);
        
        if (minheap.size() > k) {
        minheap.poll(); // Remove the smallest element so we keep top k
    }
          
        return minheap.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
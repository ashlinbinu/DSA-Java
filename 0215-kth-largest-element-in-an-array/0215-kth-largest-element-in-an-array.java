class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        int x =0;
        while(k>0)
        {
            x= pq.poll();
            k--;
        }
        return x;
    }
}
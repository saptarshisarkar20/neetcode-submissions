class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;
        for (int it : nums) minHeap.offer(it);

        while (minHeap.size() > k) minHeap.poll();
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        }

        else if (val > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}

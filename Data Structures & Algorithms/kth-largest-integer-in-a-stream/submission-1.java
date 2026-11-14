class KthLargest {
    PriorityQueue<Integer> maxHeap;
    int N;

    public KthLargest(int k, int[] nums) {
        N = k;
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            maxHeap.offer(i);
            // System.out.println("Insert -> " + i);
        }
        // System.out.println("#########");
    }

    public int add(int val) {
        List<Integer> l = new ArrayList<>();
        maxHeap.offer(val);
        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp = maxHeap.peek();
            l.add(temp);
            maxHeap.poll();
            // System.out.println("drop -> " + temp);
        }
        for (int it : l) maxHeap.offer(it);
        // System.out.println("#########");
        return temp;
    }
}

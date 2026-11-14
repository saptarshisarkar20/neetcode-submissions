class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int it : stones) {
            maxHeap.offer(it);
        }
        int ans = 0;
        while (maxHeap.size() > 1) {
            int y = maxHeap.peek();
            maxHeap.poll();
            int x = maxHeap.peek();
            maxHeap.poll();

            if (y - x > 0)
                maxHeap.offer(y - x);
            ans = y - x;
        }

        return maxHeap.size() > 0 ? maxHeap.peek() : ans;
    }
}

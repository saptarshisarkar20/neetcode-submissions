class Solution {
 public Map<Integer, Integer> shortestPath(int n, List<List<Integer>> edges, int src) {
        Map<Integer, Integer> ans = new HashMap<>();
        PriorityQueue<PairDist> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.dist));
        int[] dists = new int[n];

        Map<Integer, List<PairDist>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
            dists[i] = Integer.MAX_VALUE - 100;
        }

        for (List<Integer> it : edges) {
            int fromNode = it.get(0);
            int toNode = it.get(1);
            int dist = it.get(2);
            adj.get(fromNode).add(new PairDist(toNode, dist));
        }

        pq.add(new PairDist(src, 0));
        dists[src] = 0;

        while (!pq.isEmpty()) {
            PairDist temp = pq.poll();
            int node = temp.node;
            int dist = temp.dist;
            for (PairDist it : adj.get(node)) {
                if (dists[it.node] > dist + it.dist) {
                    dists[it.node] = dist + it.dist;
                    pq.add(new PairDist(it.node, dists[it.node]));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            ans.put(i, dists[i]);
        }
        return ans;
    }

    class PairDist {
        Integer dist;
        Integer node;

        public PairDist(Integer node, Integer dist) {
            this.dist = dist;
            this.node = node;
        }
    }
}

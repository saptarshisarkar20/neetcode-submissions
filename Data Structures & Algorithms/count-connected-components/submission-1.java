class Solution {
    private void bfs(Map<Integer, List<Integer>> mp, int[] vis, int node) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        // vis[node] = 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            vis[x] = 1;
            if (mp.get(x) != null)
                for (int it : mp.get(x)) {
                    if (vis[it] != 1) {
                        q.add(it);
                    }
                }
        }
    }

    public int countComponents(int n, int[][] edges) {
        int ans = 0;
        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            mp.putIfAbsent(x, new ArrayList<>());
            mp.get(x).add(y);

                       mp.putIfAbsent(y, new ArrayList<>());
                       mp.get(y).add(x);
        }
        int[] vis = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (vis[i] != 1) {
                ans++;
                bfs(mp, vis, i);
            }
        }
        return ans;
    }
}

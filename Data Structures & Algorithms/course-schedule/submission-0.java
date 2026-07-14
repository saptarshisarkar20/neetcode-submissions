class Solution {
private int[] ans;
    private Map<Integer, List<Integer>> adj;
    private int[] vis;
    private int[] pathVis;
    private int ind;

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private boolean checkCycle(int node) {
        vis[node] = 1;
        pathVis[node] = 1;
        // ans[ind++] = node;
        for (int it : adj.get(node)) {
            if (vis[it] != 1) {
                if (checkCycle(it)) return true;
            } else if (pathVis[it] == 1) return true;
        }
        ans[ind++] = node;
        pathVis[node] = 0;
        return false;
    }

    /**
     * @param numCourses: a total of n courses
     * @param graph:      a list of prerequisite pairs
     * @return: the course order
     */
    public boolean canFinish(int numCourses, int[][] graph) {
        // write your code here
        adj = new HashMap<>();
        int E = graph.length;

        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] it : graph) {
            int x = it[0];
            int y = it[1];

            adj.get(y).add(x);
        }

        int V = numCourses;
        vis = new int[V];
        pathVis = new int[V];
        ans = new int[V];
        ind = 0;

        for (int i = 0; i < V; i++) {
            if (vis[i] != 1) {
                if (checkCycle(i)) return false;
            }
        }
        // reverseArray(ans);
        return true;
    }
}

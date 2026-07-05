class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1;
        int[] lg = new int[h.length];
        int[] rg = new int[h.length];

        int ans = 0;

        lg[0] = h[0];
        for (int i = 1; i < h.length; i++) {
            lg[i] = Math.max(lg[i - 1], h[i]);
        }

        rg[r] = h[r];
        for (int i = r-1; i >= 0; i--) {
            rg[i] = Math.max(rg[i + 1], h[i]);
        }

        for (int i = 0; i < h.length; i++) {
            int curr = Math.min(lg[i], rg[i]) * h[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}

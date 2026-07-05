class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1;
        int[] lg = new int[h.length];
        int[] rg = new int[h.length];

        int ans = 0;

        lg[0] = 0;
        for (int i = 1; i < h.length; i++) {
            lg[i] = Math.max(lg[i - 1], h[i - 1]);
        }
        // System.out.println(Arrays.toString(lg));

        rg[r] = 0;
        for (int i = r - 1; i >= 0; i--) {
            rg[i] = Math.max(rg[i + 1], h[i + 1]);
        }
        System.out.println(Arrays.toString(rg));

        for (int i = 0; i < h.length; i++) {
            // System.out.println("left -> " + lg[i] + " right -> " + rg[i] + " height -> " + h[i]);

            int curr = Math.min(lg[i], rg[i]) - h[i];
            // System.out.println("Curr -> " + curr);
            if(curr>0)
            ans += curr;
        }
        return ans;
    }
}

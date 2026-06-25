class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        int ind = 0;

        for (int i = 0; i <= n; i++) {
            int cnt = 0;
            int x = i;

            while (x > 0) {
                if ((x & 1) == 1) cnt++;
                x = x >> 1;
            }

            ans[ind] = cnt;
            ind++;
        }
        return ans;
    }
}

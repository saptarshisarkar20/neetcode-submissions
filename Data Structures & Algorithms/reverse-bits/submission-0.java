class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int cnt = 32;
        while (n > 0) {
            int t = (n & 1);
            n = n >> 1;

            ans = ans << 1;
            ans = ans | t;
            cnt--;
        }
        ans = ans << cnt;

        return ans;
    }
}

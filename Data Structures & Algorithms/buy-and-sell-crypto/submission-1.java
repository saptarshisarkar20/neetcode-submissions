class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, mm = Integer.MAX_VALUE;

        for (int it : prices) {
            mm = Math.min(mm, it);
            ans = Math.max(ans, it - mm);
        }
        return ans;

    }
}

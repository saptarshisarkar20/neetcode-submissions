class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int ans = 0, cnt = 1;

        for (int num : nums) st.add(num);

        for (Integer num : st) {
            if (!st.contains(num - 1)) {
                while (st.contains(num + 1)) {
                    cnt++;
                    num = num + 1;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}

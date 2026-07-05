class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int ans = 0;

        for (int num : nums) st.add(num);

        for (Integer num : st) {
            if (!st.contains(num - 1)) {
                int cnt = 1;
                int curr = num;
                while (st.contains(curr + 1)) {
                    cnt++;
                    curr = curr + 1;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}

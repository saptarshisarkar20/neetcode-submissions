class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        Map<Character, Integer> mp = new HashMap<>();
        int l = 0, r = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            if (!mp.containsKey(s.charAt(r))) {
                mp.put(c, r);
                r++;
            } else {
                l = mp.get(c) + 1;
                mp.remove(c);
            }
            ans = Math.max(ans, r - l );
        }

        return ans;
    }
}

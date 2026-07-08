class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        Map<Character, Integer> mp = new HashMap<>();
        int l = 0, r = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            if (!mp.containsKey(s.charAt(r))) {
                mp.put(c, r);
            } else {
                l = Math.max(l, mp.get(c) + 1);

                mp.put(c, r);
            }
            // System.out.println(mp + " # l -> " + l + " r -> " + r);

            r++;
            ans = Math.max(ans, r - l);
        }
        return ans;
    }
}

class Solution {
 public boolean isHappy(int num) {
        Set<Integer> st = new HashSet<>();

        int curr = num;

        while (curr != 1) {
            int n = curr;
            curr = 0;
            if (st.contains(n)) return false;
            while (n > 0) {
                int t = n % 10;
                n = n / 10;
                curr += t * t;
                // System.out.println(t);
            }
            st.add(curr);
            // System.out.println(curr);
        }
        return true;
    }
}

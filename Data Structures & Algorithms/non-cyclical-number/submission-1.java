class Solution {
 public boolean isHappy(int num) {
        Set<Integer> st = new HashSet<>();
        // st.add(num);
        int curr = num;

        while (curr != 1) {
            // System.out.println("in loop curr-> "+curr);
            int n = curr;
            st.add(curr);
            curr = 0;
            while (n > 0) {
                int t = n % 10;
                n = n / 10;
                curr += (t * t);
                // System.out.print((t*t)+" + ");
                
            }
            // System.out.println();
            if (st.contains(curr)) return false;
            // System.out.println("out loop curr-> "+curr);
        }
        return true;
    }
}

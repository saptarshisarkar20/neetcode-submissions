class Solution {
    public int evalRPN(String[] tk) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tk.length; i++) {
            String x = tk[i];

            if ("+".equals(x) || "-".equals(x) || "*".equals(x) || "/".equals(x)) {
                int a = st.pop();
                int b = st.pop();

                int z = 0;
                if ("+".equals(x))
                    z = a + b;
                else if ("-".equals(x))
                    z = b - a;
                else if ("*".equals(x))
                    z = b * a;
                else if ("/".equals(x))
                    z = b / a;
                st.push(z);

            } else {
                st.push(Integer.parseInt(x));
            }
            // System.out.println(st.peek());
        }

        return st.peek();
    }
}

class Solution {
    public int evalRPN(String[] tk) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < tk.length; i++) {
            String x = tk[i];

            if ("+".equals(x) || "-".equals(x) || "*".equals(x) || "/".equals(x)) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());

                int z = 0;
                if ("+".equals(x))
                    z = a + b;
                else if ("-".equals(x))
                    z = b - a;
                else if ("*".equals(x))
                    z = b * a;
                else if ("/".equals(x))
                    z = b / a;
                st.push(String.valueOf(z));

            } else {
                st.push(x);
            }
            // System.out.println(st.peek());
        }

        return Integer.parseInt(st.peek());
    }
}

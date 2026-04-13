class MinStack {
    List<Integer> ll;

    public MinStack() {
        ll = new ArrayList<>();
    }

    public void push(int val) {
        ll.add(val);
    }

    public void pop() {
        ll.remove(ll.size() - 1);
    }

    public int top() {
        return ll.get(ll.size() - 1);
    }

    public int getMin() {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ll.size(); i++) {
            ans = Math.min(ans, ll.get(i));
        }
        return ans;
    }
}

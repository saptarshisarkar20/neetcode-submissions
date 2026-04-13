class MinStack {
    List<Integer> ll;
    List<Integer> ml;

    public MinStack() {
        ll = new ArrayList<>();
        ml = new ArrayList<>();
    }

    public void push(int val) {
        ll.add(val);
        if (!ml.isEmpty()) {
            ml.add(Math.min(ml.get(ml.size() - 1), val));
        } else {
            ml.add(val);
        }
    }

    public void pop() {
        ll.remove(ll.size() - 1);
        ml.remove(ml.size() - 1);
    }

    public int top() {
        return ll.get(ll.size() - 1);
    }

    public int getMin() {
        return ml.get(ml.size() - 1);
    }
}

class TempInd {
    int temp;
    int ind;
    TempInd(int temp, int ind) {
        this.temp = temp;
        this.ind = ind;
    }

    public int getTemp() {
        return temp;
    }

    public int getInd() {
        return ind;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<TempInd> st = new Stack<>();
        // List<Integer> ans = new ArrayList<>();
        int n = t.length;
        int[] ans = new int[n];
        

        for (int i = n - 1; i >= 0; i--) {
            int x = t[i];
            while (!st.isEmpty()) {
                TempInd ti = st.peek();
                if (ti.getTemp() < x) {
                    st.pop();
                } else {
                    int z = ti.getInd() - i;
                    ans[i]= z;
                    break;
                }
            }
            st.push(new TempInd(x, i));
        }
        return ans;
    }
}

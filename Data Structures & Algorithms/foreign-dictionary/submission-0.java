class Solution {

    private void buildMap(Map<Character, List<Character>> adj, Map<Character, Integer> inDeg, String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                inDeg.putIfAbsent(a.charAt(i), 0);
                inDeg.putIfAbsent(b.charAt(i), 0);
                inDeg.put(b.charAt(i), inDeg.get(b.charAt(i)) + 1);
                adj.putIfAbsent(a.charAt(i), new ArrayList<>());
                adj.get(a.charAt(i)).add(b.charAt(i));
            }
        }
    }

    public String foreignDictionary(String[] words) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> inDeg = new HashMap<>();
        Map<Character, List<Character>> adj = new HashMap<>();

        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
//            a = new StringBuilder(a).reverse().toString();

            String b = words[i + 1];
//            b = new StringBuilder(b).reverse().toString();

            if (!a.equals(b)) buildMap(adj, inDeg, a, b);
        }

        Queue<Character> dq = new ArrayDeque<>();
        for (Map.Entry<Character, Integer> entry : inDeg.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
//            System.out.println(key + " : " + value);
            if (value == 0) dq.add(key);
        }

        while (!dq.isEmpty()) {
            char x = dq.poll();
            ans.append(x);

            if (adj.get(x) != null) {
                for (char c : adj.get(x)) {
                    inDeg.put(c, inDeg.get(c) - 1);
                    if (inDeg.get(c) == 0) {
                        dq.add(c);
                    }
                }
            }
        }

        return ans.toString();
    }

}

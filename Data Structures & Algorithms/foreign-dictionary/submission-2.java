class Solution {

    private void buildMap(Map<Character, HashSet<Character>> adj, Map<Character, Integer> inDeg, String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (!adj.get(a.charAt(i)).contains(b.charAt(i))) {
                    inDeg.put(b.charAt(i), inDeg.get(b.charAt(i)) + 1);
                    adj.get(a.charAt(i)).add(b.charAt(i));
                }
                break;
            }
        }
    }

    public String foreignDictionary(String[] words) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> inDeg = new HashMap<>();
        Map<Character, HashSet<Character>> adj = new HashMap<>();

        for (String s : words) {
            String a = s;
            int m = a.length();
            for (int j = 0; j < m; j++) {
                char c = a.charAt(j);
                adj.putIfAbsent(c, new HashSet<>());
                inDeg.putIfAbsent(c, 0);
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
            int m = a.length();

            String b = words[i + 1];
            int n = b.length();


            int minLen = Math.min(m, n);
            if (m > n && a.substring(0, minLen).equals(b.substring(0, minLen))) return "";

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

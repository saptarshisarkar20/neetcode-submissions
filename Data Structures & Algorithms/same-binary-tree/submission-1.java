/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private static final int DUMB = 100009;

    private void inOrder(TreeNode node, List<Integer> ans) {
        if (node == null) {
            ans.add(DUMB);
            return;
        }

        ans.add(node.val);
        inOrder(node.left, ans);
        inOrder(node.right, ans);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        inOrder(p, l);
        inOrder(q, r);
        if (l.size() != r.size())
            return false;

        // System.out.println(l.toString());
        // System.out.println(r.toString());
        for (int i = 0; i < Math.min(l.size(), r.size()); i++) {
            // System.out.println("l -> " + l.get(i) + " | r -> " + r.get(i));

            if (!l.get(i).equals(r.get(i)))
                return false;
        }
        return true;
    }
}

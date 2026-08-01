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

    private int ans;

    private void isGood(TreeNode root, int routeMax) {
        if (root == null) {
            return;
        }

        if (routeMax <= root.val) {
            ans++;
        }

        isGood(root.left, Math.max(routeMax, root.val));
        isGood(root.right, Math.max(routeMax, root.val));
    }

    public int goodNodes(TreeNode root) {
        ans = 0;
        isGood(root, Integer.MIN_VALUE);
        return ans;
    }
}

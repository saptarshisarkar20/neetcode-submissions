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

    private int findSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findSum(root.left);
        int right = findSum(root.right);

        int curr = (right + root.val + left);
        ans = Math.max(ans, curr);
        // System.out.println("l=" + left + " r=" + right + " root=" + root.val + " ans=" + ans);
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        findSum(root);
        return ans;
    }
}

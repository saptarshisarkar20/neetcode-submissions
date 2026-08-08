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

        int left_or_right_path = Math.max(left, right) + root.val;
        int only_root = root.val;
        int left_and_right_path = left + root.val + right;

        ans = Math.max(ans, Collections.max(Arrays.asList(left_and_right_path, only_root, left_or_right_path)));

        return Math.max(only_root, left_or_right_path);
    }


    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        findSum(root);
        return ans;
    }

}

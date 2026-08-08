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

        ans = Math.max(ans, Collections.max(Arrays.asList(right + root.val + left, right + root.val, left + root.val, root.val)));
        return root.val + Math.max(left, right);
    }


    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        findSum(root);
        return ans;
    }

}

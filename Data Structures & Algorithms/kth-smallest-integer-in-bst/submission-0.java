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
    private int order;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        order = 0;
        traverseInOrder(root, k);
        return ans;
    }

    private void traverseInOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left, k);
        order++;
        if (order == k) {
            ans = root.val;
        }

        traverseInOrder(root.right, k);
    }
}

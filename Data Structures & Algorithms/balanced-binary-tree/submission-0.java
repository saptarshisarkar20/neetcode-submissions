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
    boolean ans = true;

    private int checkBal(TreeNode root) {
        if (root == null) return 0;

        int l = checkBal(root.left);
        int r = checkBal(root.right);
        // System.out.println("Node:" + root.val + " | l:" + l + " | r:" + r);

        if (l != r + 1 && r != l + 1 && l!=r) {
            ans = false;
            // System.out.println("Node:" + root.val + " | l:" + l + " | r:" + r);
        }
        return 1 + Math.max(l, r);

    }

    public boolean isBalanced(TreeNode root) {
        checkBal(root);
        return ans;
    }

}

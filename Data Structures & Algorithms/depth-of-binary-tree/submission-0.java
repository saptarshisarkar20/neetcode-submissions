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
 int ans;
    private void findMaxDepth(TreeNode root, int deep) {
        if(root == null){
            return;
        }
       if (root.left == null && root.right == null) {
           ans = Math.max(ans, 1 + deep);
       }

       if (root.left != null) 
            findMaxDepth(root.left, deep + 1);
       if (root.right != null) 
            findMaxDepth(root.right, deep + 1);
    }

    public int maxDepth(TreeNode root) {
        ans = 0;
        findMaxDepth(root, 0);
        return ans;
    }
}

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
    private List<List<Integer>> levelList;

    private void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        while (levelList.size() <= level) {
            levelList.add(new ArrayList<>());
        }
        levelList.get(level).add(root.val);

        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        levelList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        traverse(root, 0);

        for (List<Integer> it : levelList) {
            ans.add(it.get(it.size() - 1));
        }
        return ans;
    }
}

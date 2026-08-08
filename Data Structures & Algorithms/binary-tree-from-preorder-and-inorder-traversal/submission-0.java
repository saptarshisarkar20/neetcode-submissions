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
private int preInd;

    private int getIdx(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    private TreeNode buildOurTree(int[] pre, int[] ino, int inL, int inR) {
        if (inL > inR) {
            return null;
        }
        if (preInd > pre.length - 1) {
            return null;
        }
        int val = pre[preInd];
        TreeNode root = new TreeNode(val);
        preInd++;
        int mid = getIdx(ino, val);

        root.left = buildOurTree(pre, ino, inL, mid - 1);
        root.right = buildOurTree(pre, ino, mid + 1, inR);
        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preInd = 0;
        return buildOurTree(preorder, inorder, 0, inorder.length - 1);
    }
}

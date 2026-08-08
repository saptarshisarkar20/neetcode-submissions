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

public class Codec {
    private String getSelVal(TreeNode root, Queue<TreeNode> q) {
        if (root == null) {
            return "#,";
        }
        q.offer(root);
        return String.valueOf(root.val) + ",";
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        if (root == null) {
            return sb.toString();
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        sb.append(root.val);
        sb.append(",");

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            sb.append(getSelVal(curr.left, q));
            sb.append(getSelVal(curr.right, q));
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] values = data.split(",");
        if (values.length == 0 || values[0].isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            TreeNode curr = q.poll();

            // Left child
            if (i < values.length && !values[i].isEmpty() && !values[i].equals("#")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].isEmpty() && !values[i].equals("#")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }
}

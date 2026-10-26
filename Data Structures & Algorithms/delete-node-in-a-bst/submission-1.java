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
    private TreeNode inorderSuccessor(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) { 
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // Check if its a leaf node
            if (root.left == null && root.right == null) return null;

            // Check if they have a single child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node has both childrens
            TreeNode node = inorderSuccessor(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);
        }
        return root;
    }
}
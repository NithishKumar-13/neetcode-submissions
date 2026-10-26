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
    private int sumNumbers(TreeNode root, int result) {
        if (root == null) {
            return 0;
        }
        
        result = (result * 10) + root.val;

        if (root.left == null && root.right == null) {
            return result;
        }

        return sumNumbers(root.left, result) + sumNumbers(root.right, result);
    }
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
}
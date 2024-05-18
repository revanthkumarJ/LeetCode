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
    public int res;
    public int distributeCoins(TreeNode root) {
        res = 0;
        help(root);
        return res;
    }
    public int help(TreeNode root) {
        if (root == null) return 0;
        int leftCoins = help(root.left);
        int rightCoins = help(root.right);
        res += Math.abs(leftCoins) + Math.abs(rightCoins);
        return (root.val - 1) + leftCoins + rightCoins;
    }
}
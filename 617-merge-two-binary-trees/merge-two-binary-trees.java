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
    public void merge(TreeNode r1, TreeNode r2)
    {
        if(r1!=null && r2!=null)
        {
            r1.val+=r2.val;
            if(r1.left==null && r2.left!=null) 
            {
                r1.left=r2.left;
            }
            else if(r1.left!=null && r2.left!=null)
            {
                merge(r1.left,r2.left);
            }
            if(r1.right==null && r2.right!=null)
            {
                r1.right=r2.right;
            }
            else if(r1.right!=null && r2.right!=null)
            {
                merge(r1.right,r2.right);
            }
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        merge(root1,root2);
        return root1;
    }
}
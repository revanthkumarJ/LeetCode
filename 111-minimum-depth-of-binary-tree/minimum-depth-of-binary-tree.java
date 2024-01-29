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
    int m;
    public void min(TreeNode root ,int s)
    {
        if(root==null)
        return ;
        if(root.left==null && root.right==null)
        {
            s++;
            if(m>s)
            m=s;
        }
        else
        {
            min(root.left,s+1);
            min(root.right,s+1);
        }


    }
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        m=Integer.MAX_VALUE;
        min(root,0);
        return m;
    }
}
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
    TreeNode h;
    public void remove(TreeNode root,int target)
    {
        if(root==null)
        return ;
        TreeNode left=root.left;
        TreeNode right=root.right;
        if(root==h && root.val==target && root.left==null && root.right==null)
        h=null;
        if(left!=null)
        {
            if(left.val==target && left.left==null && left.right==null){
            root.left=null;
            remove(h,target);
            }
        }
        if(right!=null)
        {
            if(right.val==target && right.left==null && right.right==null){
            root.right=null;
            remove(h,target);
            }
        }
        
        
        remove(root.left,target);
        remove(root.right,target);
        
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        h=root;
        if(root.left==null && root.right==null && root.val==target)
        return null;
        remove(root,target);
        return h;
    }
}
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
    public boolean current(TreeNode root,int sum,int targetSum)
    {
        if(root.left==null && root.right==null)
        {
            sum=sum+root.val;
            if(sum==targetSum)
            return true;
            else
            return false;
        }
        else if(root.left!=null && root.right!=null)
        return current(root.left,sum+root.val,targetSum) || current(root.right,sum+root.val,targetSum);
        else if(root.left!=null)
        return current(root.left,sum+root.val,targetSum);
        return current(root.right,sum+root.val,targetSum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return  false;
        return current(root,0,targetSum);
    }
}
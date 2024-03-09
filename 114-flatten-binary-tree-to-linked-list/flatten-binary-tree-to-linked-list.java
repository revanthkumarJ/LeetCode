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
    Queue<TreeNode> array;
    public void add(TreeNode root)
    {
        if(root==null)
        return ;
        array.add(root);
        add(root.left);
        add(root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null)return;
        array=new LinkedList<>();
        add(root);
        TreeNode temp=array.poll();
        temp.left=null;
        while(!array.isEmpty())
        {
            TreeNode curr=array.poll();
            curr.left=null;
            temp.right=curr;
            temp=curr;
        }
        temp.right=null;
    }
}
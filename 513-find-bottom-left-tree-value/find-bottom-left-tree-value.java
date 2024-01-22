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
    public int findBottomLeftValue(TreeNode root) {
        int min=-1;
        if(root==null)
        return -1;
        Queue<TreeNode> array=new LinkedList<>();
        array.add(root);
        while(!array.isEmpty())
        {
            int count=array.size();
            min=array.peek().val;
            for(int i=1;i<=count;i++)
            {
                TreeNode ele=array.poll();
                if(ele.left!=null)
                array.add(ele.left);
                if(ele.right!=null)
                array.add(ele.right);
            }
        }
        return min;
    }
}
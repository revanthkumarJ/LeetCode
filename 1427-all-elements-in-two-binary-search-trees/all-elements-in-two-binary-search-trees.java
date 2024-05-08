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
    List<Integer> res;
    public void add(TreeNode root)
    {
        if(root!=null)
        {
            res.add(root.val);
            add(root.left);
        add(root.right);
        }
        
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        res=new ArrayList<>();
        add(root1);
        add(root2);
        Collections.sort(res);
        return res;
    }
}
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
    public String res="";
    public void curr(TreeNode root,String r)
    {
        if(root==null)
        return ;
        r=(char)((int)'a'+root.val)+r;
        if(root.left==null && root.right==null)
        {
            
            if(res.equals("") || res.compareTo(r)>0)
            res=r;
        }
        else
        {
            curr(root.left,r);
            curr(root.right,r);
        }
    }
    public String smallestFromLeaf(TreeNode root) {
        res="";
        curr(root,"");
        return res;
    }
}
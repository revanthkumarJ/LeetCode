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
    public boolean isEvenOddTree(TreeNode root) {
        boolean isEven=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            int prev=-1;
    
                for(int i=1;i<=count;i++)
                {
                    TreeNode ele=q.poll();
                    if( isEven)
                    {
                        if(ele.val%2==0)
                        return false;
                        if(!(prev==-1 || prev<ele.val))
                        return false;
                    }
                    else
                    {
                        if(ele.val%2!=0)
                        return false;
                        if(!(prev==-1 || prev>ele.val))
                        return false;
                    }
                    if(ele.left!=null)
                    q.add(ele.left);
                    if(ele.right!=null)
                    q.add(ele.right);
                    prev=ele.val;
                }
            isEven=!isEven;
            
        }
        return true;
    }
}
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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean isodd=false;
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=1;i<=s;i++)
            {
                TreeNode ele=q.poll();
                if(isodd)
                ele.val=st.pop();
                if(ele.left!=null)
                q.add(ele.left);
                if(ele.right!=null)
                q.add(ele.right);
                if(!isodd)
                {
                    if(ele.left!=null)
                    st.push(ele.left.val);
                    if(ele.right!=null)
                    st.push(ele.right.val);
                }
            }
            isodd=!isodd;
        }
        return root;
    }
}
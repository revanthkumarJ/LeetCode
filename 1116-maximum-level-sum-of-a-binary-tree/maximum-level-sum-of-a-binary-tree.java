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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int maxLevel=1;
        int level=1;
        int maxSum=0;
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        while(queue.size()>0){
            int size=queue.size();
            int sum=0;
            for(int i=1;i<=size;i++){
                TreeNode ele= queue.poll();
                sum+=ele.val;
                if(ele.left!=null)
                queue.add(ele.left);
                if(ele.right!=null)
                queue.add(ele.right);
            }
            if(level==1 || maxSum<sum){
                maxSum=sum;
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;
    }
}
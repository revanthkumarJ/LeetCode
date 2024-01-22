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
    public TreeNode add(int nums[],int start,int end)
    {
        if(start>end)
        return null;
        int m=(start+end)/2;
        TreeNode head=new TreeNode(nums[m]);
        head.left=add(nums,start,m-1);
        head.right=add(nums,m+1,end);
        return head;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return add(nums,0,nums.length-1);
    }
}
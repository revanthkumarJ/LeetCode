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
    int max;
    HashMap<Integer,Integer> array;
    public void find(TreeNode root)
    {
        if(root==null)
        return ;
        array.put(root.val,array.getOrDefault(root.val,0)+1);
        if(array.get(root.val)>max)
        max=array.get(root.val);
        find(root.left);
        find(root.right);
    }
    public int[] findMode(TreeNode root) {
        max=0;
        array=new HashMap<>();
        array.put(-1,0);
        find(root);
        int n=0;
        for(int i:array.values())
        {
            if(i==max)
            n++;
        }
        int res[]=new int[n];
        n=0;
        for(int i:array.keySet())
        {
            if(array.get(i)==max)
            res[n++]=i;
        }
        return res;
    }
}
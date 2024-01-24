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
    boolean isPalindromic(HashMap<Integer,Integer> array)
    {
        boolean isOdd=false;
        for(int i=0;i<=9;i++)
        {
            if(array.containsKey(i))
            {
                int n=array.get(i);
                if(n%2==0)
                continue;
                else
                {
                    if(isOdd)
                    return false;
                    isOdd=true;
                }
            }
        }
        return true;
    }
    public int add(TreeNode root,HashMap<Integer,Integer>  array)
    {
        if(root==null)
        return 0;
        
        if(root.left!=null && root.right!=null)
        {
            HashMap<Integer,Integer> a=new HashMap<>();
            a.putAll(array);
            a.put(root.val,a.getOrDefault(root.val,0)+1);
            HashMap<Integer,Integer> aa=new HashMap<>();
            aa.putAll(array);
            aa.put(root.val,aa.getOrDefault(root.val,0)+1);
            return add(root.left,a) + add(root.right,aa);
        }
        if(root.left==null && root.right==null)
        {
            HashMap<Integer,Integer> aa=new HashMap<>();
            aa.putAll(array);
            aa.put(root.val,aa.getOrDefault(root.val,0)+1);
            if(isPalindromic(aa))
            return 1;
            else
            return 0;
        }
        else if(root.left!=null)
        {
            HashMap<Integer,Integer> aa=new HashMap<>();
            aa.putAll(array);
            aa.put(root.val,aa.getOrDefault(root.val,0)+1);
            return add(root.left,aa);
        }
        else
        {
            HashMap<Integer,Integer> aa=new HashMap<>();
            aa.putAll(array);
            aa.put(root.val,aa.getOrDefault(root.val,0)+1);
            return add(root.right,aa);
        }

    }
    public int pseudoPalindromicPaths (TreeNode root) {
        return add(root,new HashMap<Integer,Integer>());
    }
}
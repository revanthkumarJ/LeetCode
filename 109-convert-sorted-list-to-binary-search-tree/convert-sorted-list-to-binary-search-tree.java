/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode add(ArrayList<Integer> array,int start,int end)
    {
        if(start>end)
        return null;
        int m=(start+end)/2;
        TreeNode head=new TreeNode(array.get(m));
        head.left=add(array,start,m-1);
        head.right=add(array,m+1,end);
        return head;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> array=new ArrayList<>();
        while(head!=null)
        {
            array.add(head.val);
            head=head.next;
        }
        return add(array,0,array.size()-1);
    }
}
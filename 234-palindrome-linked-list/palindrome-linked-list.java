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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        Stack<Integer> s=new Stack<>();
        while(fast!=null && fast.next!=null)
        {
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
        slow=slow.next;
        while(slow!=null)
        {
            if(slow.val!=s.pop())
            return false;
            slow=slow.next;
        }
        return true;

    }
}
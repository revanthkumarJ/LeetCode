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
        Stack<ListNode> st = new Stack<>();

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            st.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }

        while(st.size()>0){
            ListNode mid= st.pop();
            if(mid.val!=slow.val)
            return false;
            slow=slow.next;
        }

        return true;
    }
}
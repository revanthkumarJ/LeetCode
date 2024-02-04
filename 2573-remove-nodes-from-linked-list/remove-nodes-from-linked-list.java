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
    public ListNode removeNodes(ListNode head) {
        if(head==null)
        return null;
        Stack<ListNode> st=new Stack<>();
        ListNode temp;
        while(head!=null)
        {
            while(!st.isEmpty() && st.peek().val<head.val)
            {
                temp=st.pop();
            }
            st.push(head);
            head=head.next;
        }
        ListNode prev=st.pop();
        prev.next=null;
        while(!st.isEmpty())
        {
            temp=st.pop();
            temp.next=prev;
            prev=temp;
        }
        return prev;
        
    }
}
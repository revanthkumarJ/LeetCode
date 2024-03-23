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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        Stack<ListNode> s=new Stack<>();
        Queue<ListNode> q=new LinkedList<>();
        while(fast!=null && fast.next!=null)
        {
            q.add(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
        {
            q.add(slow);
            slow=slow.next;
        }
        while(slow!=null)
        {
            s.push(slow);
            slow=slow.next;
        }

        head=q.poll();
        ListNode temp=head;
        while(!s.isEmpty())
        {
            temp.next=s.pop();
            temp=temp.next;
            if(!q.isEmpty())
            {
                temp.next=q.poll();
                temp=temp.next;
            }
        }
        temp.next=null;
    }
}
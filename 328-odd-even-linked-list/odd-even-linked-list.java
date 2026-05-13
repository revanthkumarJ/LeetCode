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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode even = head;
        ListNode odd =head.next;
        ListNode oddRef=head.next;
        Boolean isOdd = false;

        while(odd!=null){
            if(odd.next!=null)
            even.next=odd.next;
            else{
                isOdd=true;
                even.next=oddRef;
            }
            
            if(odd.next!=null)
            odd.next=odd.next.next;
            even=even.next;
            odd=odd.next;
        }
        if(even!=null && !isOdd)
        even.next=oddRef;

        return head;
    }
}
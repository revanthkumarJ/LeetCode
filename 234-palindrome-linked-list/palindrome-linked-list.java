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
    public boolean isPalindrome(String r)
    {
        if(r.length()<=1)
        return true;
        for(int i=0;i<r.length()/2;i++)
        {
            if(r.charAt(i)!=r.charAt(r.length()-1-i))
            return false;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        String r="";
        while(head!=null)
        {
            r=r+head.val;
            head=head.next;
        }
        return isPalindrome(r);
    }
}
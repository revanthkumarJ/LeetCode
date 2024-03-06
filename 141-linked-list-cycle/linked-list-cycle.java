
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> a=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(a.contains(temp))
            return true;
            a.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
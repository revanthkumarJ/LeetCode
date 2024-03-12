class Solution 
{
    public ListNode removeZeroSumSublists(ListNode head) 
    {
        int prefixSum=0;
        ListNode n=new ListNode(0);
        HashMap<Integer,ListNode> array=new HashMap<>();
        array.put(0,n);
        n.next=head;
        while(head!=null)
        {
            prefixSum+=head.val;
            if(array.containsKey(prefixSum))
            {
                ListNode start=array.get(prefixSum);
                int sum=prefixSum;
                ListNode temp=start.next;
                while(temp!=head)
                {
                    sum+=temp.val;
                    array.remove(sum);
                    temp=temp.next;
                    
                }
                start.next=head.next;
            }
            else
                array.put(prefixSum,head);
            head=head.next;
        }
        return n.next;
    }
}
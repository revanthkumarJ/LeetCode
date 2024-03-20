class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start=null,end=null;
        int i=0;
        if(a==0)
        {
            end=list1;
            while(i<=b)
            {
                end=end.next;
                i++;
            }
            list1=end;
            if(list2==null)
            return list1;
            else
            {
                ListNode ptr=list2;
                while(ptr.next!=null)
                {
                    ptr=ptr.next;
                }
                ptr.next=end.next;
                end.next=list2;
                return list1;
            }

        }
        else
        {
            start=list1;
            while(i<a-1)
            {
                i++;
                start=start.next;
            }
            end=start;
            while(i<b)
            {
                i++;
                end=end.next;
            }
            if(list2==null)
            start.next=end.next;
            else
            {
                start.next=list2;
                while(list2.next!=null)
                {
                    list2=list2.next;
                }
                list2.next=end.next;
            }

        }
        return list1;
    }
}
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if(head==None):
            return None
        slow=head
        fast=head.next
        while(slow and fast):
            if(slow==fast):
                return True
            slow=slow.next
            if(fast.next==None):
                return False
            fast=fast.next.next
        return False
        
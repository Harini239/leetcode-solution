# Last updated: 8/12/2026, 11:22:48 AM
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def deleteDuplicates(self, head):
        current = head
        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next  # skip duplicate
            else:
                current = current.next  # move forward
        return head

from typing import Optional

class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next
        
class AddTwoNumbers:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]: # type: ignore
        dummy = ListNode()
        current = dummy
        
        carry = 0
        
        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            val = val1 + val2 + carry
            carry = val // 10
            val = val % 10
            
            current.next = ListNode(val)
            
            current = current.next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        return dummy.next
    

if __name__ == "__main__":
    solution = AddTwoNumbers()
    #listnode = ListNode()
    l1 = [2, 4, 3]
    l2 = [5, 6, 4]
    
    l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next.next = ListNode(3)
    
    l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next.next = ListNode(4)
    
    result = solution.addTwoNumbers(l1, l2)    
    
    while result:
        print(result.val)
        result = result.next
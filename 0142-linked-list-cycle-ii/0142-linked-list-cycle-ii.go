/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func detectCycle(head *ListNode) *ListNode {
    if head == nil || head.Next == nil{
        return nil
    }
    slow := head.Next
    fast := head.Next.Next
    for fast != nil && fast.Next != nil{
        if slow == fast{
            slow = head
            for(slow != fast){
                fast = fast.Next
                slow = slow.Next
            }
            return slow
        }
        slow = slow.Next
        fast = fast.Next.Next
    }
    return nil
}
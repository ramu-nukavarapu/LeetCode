/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func oddEvenList(head *ListNode) *ListNode {
    if head == nil || head.Next == nil{
        return head
    }
    odd := head
    even := head.Next
    temp := head.Next
    for(even != nil && even.Next != nil){
        odd.Next = odd.Next.Next
        even.Next = even.Next.Next
        odd = odd.Next
        even = even.Next
    }
    odd.Next = temp
    
    return head
}
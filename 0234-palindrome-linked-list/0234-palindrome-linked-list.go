/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {
    mid := findMiddle(head)
    right := reverse(mid)
    left := head
    for(left != nil && right != nil){
        if(left.Val != right.Val){
            return false
        }
        left = left.Next
        right = right.Next
    }
    return true
}

func findMiddle(head *ListNode) *ListNode{
    slow := head
    fast := head
    
    for fast.Next != nil && fast.Next.Next != nil{
        slow = slow.Next
        fast = fast.Next.Next
    }
    return slow.Next
}

func reverse(head *ListNode) *ListNode{
    if(head == nil || head.Next == nil){
        return head
    }
    newHead := reverse(head.Next)
    front := head.Next
    front.Next = head
    head.Next = nil
    return newHead
}
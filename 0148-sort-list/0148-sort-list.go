/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func sortList(head *ListNode) *ListNode {
    if(head == nil || head.Next == nil){
        return head
    }
    
    mid := findMiddle(head)
    right := mid.Next
    
    mid.Next = nil
    left := sortList(head)
    right = sortList(right)
    return merge(left,right)
}
func findMiddle(head *ListNode) *ListNode{
    slow := head
    fast := head
    for fast.Next != nil && fast.Next.Next != nil{
        slow = slow.Next
        fast = fast.Next.Next
    }
    return slow
}

func merge(left *ListNode, right *ListNode) *ListNode{
    result := &ListNode{}
    temp := result
    for left != nil && right != nil{
        if(left.Val <= right.Val){
            temp.Next = left
            left = left.Next
        }else{
            temp.Next = right
            right = right.Next
        }
        temp = temp.Next
    }
    if(left != nil){
        temp.Next = left
    }else{
        temp.Next = right
    }
    return result.Next
}
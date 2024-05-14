/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func rotateRight(head *ListNode, k int) *ListNode {
    if(head == nil || k == 0){
        return head
    }
    size := 1
    temp := head
    
    for temp.Next != nil{
        temp = temp.Next
        size++
    }

    tail := temp
    
    if(k%size == 0){
        return head
    }
    
    tail.Next = head
    k = k%size
    temp = head
    
    for i:=1;i<size-k;i++{
        temp = temp.Next
    }
    head = temp.Next
    temp.Next = nil
    
    return head
}
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    temp1,temp2 := l1,l2
    result := &ListNode{-1,nil}
    curr := result
    sum,carry := 0,0
    for(temp1 != nil || temp2 != nil){
        sum = carry
        
        if(temp1!=nil){
            sum += temp1.Val
            temp1 = temp1.Next
        }
        if(temp2!=nil){
            sum += temp2.Val
            temp2 = temp2.Next
        }
        temp := &ListNode{sum%10 , nil}
        carry = sum/10
        curr.Next = temp
        curr = temp
    }
    if(carry > 0){
        temp := &ListNode{carry , nil}
        curr.Next = temp
    }
    return result.Next
}
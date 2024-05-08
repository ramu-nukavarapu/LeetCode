/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1,temp2,curr;
        temp1 = l1;
        temp2 = l2;
        ListNode result = new ListNode(-1,null);
        curr = result;
        int sum,carry = 0;
        while(temp1 != null && temp2 != null){
            sum = temp1.val+temp2.val+carry;
            carry = 0;
            if(sum > 9){
                carry = 1;
                sum = sum%10;
            }
            ListNode temp = new ListNode(sum,null);
            curr.next = temp;
            curr = temp;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            sum = temp1.val+carry;
            carry = 0;
            if(sum > 9){
                carry = 1;
                sum = sum%10;
            }
            ListNode temp = new ListNode(sum,null);
            curr.next = temp;
            curr = temp;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sum = temp2.val+carry;
            carry = 0;
            if(sum > 9){
                carry = 1;
                sum = sum%10;
            }
            ListNode temp = new ListNode(sum,null);
            curr.next = temp;
            curr = temp;
            temp2 = temp2.next;
        }
        if(carry > 0){
            ListNode temp = new ListNode(carry,null);
            curr.next = temp;
            curr = temp;
        }
        return result.next;
    }
}
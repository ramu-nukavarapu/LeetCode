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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode tail;
        int length = 1;
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        tail=temp;
        
        if(k%length == 0){
            return head;
        }
        
        tail.next = head;
        k = k%length;
        temp = head;
        for(int i=1;i<length-k;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
        
    }
}
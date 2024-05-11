/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode result = null;
        if(head == null || head.next == null)
            return result;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                result = fast;
                return result;
            }
        }
        return result;
    }
}
// HashMap<ListNode,Integer> hp = new HashMap<>();
//         ListNode temp = head;
//         int i = 0,pos = -1;
//         while(temp != null){
//             if(hp.containsKey(temp)){
//                 pos = hp.get(temp);
//                 break;
//             }else{
//                 hp.put(temp,i);
//                 i++;
//             }
//             temp = temp.next;
//         }
//         if(pos != -1){
//             temp = head;
//             i = 0;
//             while(i <= pos && temp != null){
//                 if(i == pos){
//                     return temp;
//                 }
//                 temp = temp.next;
//                 pos--;
//             }
//         }
//         return null;
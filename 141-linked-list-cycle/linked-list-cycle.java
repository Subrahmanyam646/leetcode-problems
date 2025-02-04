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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            head = head.next;
            if(head == fast){
                return true;
            }
        }
        return false;
    }
}
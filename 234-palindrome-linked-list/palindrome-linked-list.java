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
    public boolean isPalindrome(ListNode head) {
        int len = getLengthOfLinkedList(head);
        ListNode temp = head;
        int mid = len % 2 == 0 ? len/2 : len/2+1;
        System.out.println(mid);
        for(int i = 0; i < mid ; i++){
            temp = temp.next;
        }
        temp = reverseLinkedList(temp);
        while(temp != null){
            if(temp.val != head.val){
                return false;
            }
            temp = temp.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseLinkedList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public int getLengthOfLinkedList(ListNode tempA){
        int len = 0;
        ListNode temp = tempA;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
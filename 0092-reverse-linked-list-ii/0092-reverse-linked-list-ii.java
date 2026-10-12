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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode curr = head;
        for(int i=0;i<left-1;i++){
            prev = prev.next;
            curr = curr.next;
        }
        ListNode subHead = curr;
        ListNode preNode = null;

        for(int i=0;i<=right-left;i++){
            ListNode next = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = next;
        }
        prev.next = preNode;
        subHead.next = curr;

        return dummy.next;
    }
}
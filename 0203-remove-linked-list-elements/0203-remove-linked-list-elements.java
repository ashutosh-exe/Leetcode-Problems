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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode temp = head.next;
        ListNode prev = head;
        while(head != null && head.val == val){
            head = head.next;
        }
        while(temp != null){
            if(temp.val==val){
                if(temp.next==null){
                    prev.next = null;
                }
                else{
                    prev.next = temp.next;
                }
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
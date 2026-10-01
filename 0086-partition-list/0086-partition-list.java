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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode large = largeDummy;

        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            if(curr.val<x){
                small.next = curr;
                small = small.next;
            }
            else{
                large.next = curr;
                large = large.next;
            }
            curr = next;
        }
        small.next = largeDummy.next;
        large.next = null;
        return smallDummy.next;
    }
}
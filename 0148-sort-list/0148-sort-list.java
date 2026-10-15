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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode right = sortList(head);
        ListNode left = sortList(slow);

        ListNode ans = new ListNode();
        ListNode node = ans;

        while(left != null && right != null){
            if(left.val<right.val){
                node.next = left;
                left = left.next;
                node = node.next;
            }else{
                node.next = right;
                right = right.next;
                node = node.next;
            }
        } 
        while(right != null){
            node.next = right;
            right = right.next;
            node = node.next;
        }
        while(left != null){
            node.next = left;
            left = left.next;
            node = node.next;
        }
        return ans.next;
    }
}
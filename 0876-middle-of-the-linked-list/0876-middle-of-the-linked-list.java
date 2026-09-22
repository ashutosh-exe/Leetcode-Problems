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
    public ListNode middleNode(ListNode head) {
        List<ListNode> ans = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            ans.add(curr);
            curr = curr.next;
        }
        return ans.get(ans.size()/2);
    }
}
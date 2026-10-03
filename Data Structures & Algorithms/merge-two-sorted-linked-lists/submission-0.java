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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (f != null && s != null) {
            if (f.val <= s.val) {
                curr.next = f;
                f = f.next;
            } else {
                curr.next = s;
                s = s.next;
            }
            curr = curr.next;
        }

        if (f != null) {
            curr.next = f;
        }

        if (s != null) {
            curr.next = s;
        }
        return dummy.next;
    }
}
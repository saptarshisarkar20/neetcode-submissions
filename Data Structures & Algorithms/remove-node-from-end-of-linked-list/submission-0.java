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
private static int countNodes(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        int cnt = countNodes(dummy);
        int pos = cnt - n;
        ListNode dh = dummy;
        while (--pos != 0) {
            dh = dh.next;
        }

        dh.next = dh.next.next;
        return dummy.next;
    }
}

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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev, curr, nxt;
        curr = head;
        nxt = head.next;
        prev = null;
        // head=[0,1,2,3]

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            System.out.println(curr.val);
            // if (curr.next != null)
            //     System.out.println(curr.next.val);
            curr = nxt;
            if (curr != null)
                nxt = nxt.next;
        }

        return prev;
    }
}

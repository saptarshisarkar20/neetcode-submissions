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

 private static ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

//    private static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val);
//            if (head.next != null) {
//                System.out.print(" -> ");
//            }
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        // Create list: 1 -> 2 -> 3 -> 4 -> 5
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);
//
//        System.out.println("Original List:");
//        printList(head);
//
//        reorderList(head);
//
//        System.out.println("Reversed List:");
//        printList(head);
//    }

    private static void swap(ListNode a, ListNode b) {
        ListNode temp = a;
        a = b;
        b = temp;
    }

    private static ListNode mergeLL(ListNode l1, ListNode l2) {
        ListNode head = l1;

        while (l1 != null && l2 != null) {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;

            l1.next = l2;

            if (next1 == null) {
                break;
            }

            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }

        return head;
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        head = mergeLL(head, head2);
        return;

    }
}

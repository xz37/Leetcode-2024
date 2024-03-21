package q0019;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode pre = new ListNode(0, dummy);
        while (fast != null) {
            fast = fast.next;
            if (n <= 0) {
                pre = pre.next;
            }
            n--;
        }
        pre.next = pre.next == null ? null : pre.next.next;
        return dummy.next;
    }
}
package q0142;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy, slow = dummy;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow && fast != null && fast.next != null);

        if (fast == null || fast.next == null) return null;

        ListNode ans = dummy;
        while (ans != slow) {
            ans = ans.next;
            slow = slow.next;
        }
        return ans;
    }
}

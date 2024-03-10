package q0024;

public /**
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode nextNext = head.next.next;
        ListNode next = head.next;
        head.next.next = head;
        head.next = swapPairs(nextNext);
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node = solution.swapPairs(node1);
        System.out.println(node.val);
    }
}

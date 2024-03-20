package q0160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA, nodeB = headB;
        boolean endedA = false, endedB = false;
        while (nodeA != null && nodeB != null && nodeA != nodeB) {
            if (nodeA.next != null || endedA) {
                nodeA = nodeA.next;
            } else {
                nodeA = headB;
                endedA = true;
            }

            if (nodeB.next != null || endedB) {
                nodeB = nodeB.next;
            } else {
                nodeB = headA;
                endedB = true;
            }

        }
        return (nodeA == null || nodeB == null) ? null : nodeA;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        ListNode node3 = new ListNode(3, node2);
        ListNode node7 = new ListNode(7, node2);
        ListNode node9 = new ListNode(9, node7);
        ListNode node1 = new ListNode(1, node9);

        ListNode ans = solution.getIntersectionNode(node1, node3);
        System.out.println(ans.val);


    }
}

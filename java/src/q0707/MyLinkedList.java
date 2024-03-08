package q0707;


class MyLinkedList {
    ListNode head;
    int size;


    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private int getSize() {
        return this.size;
    }

    private ListNode getNodeAtIndex(int index) {
        if (index >= getSize() || this.head == null) return null;

        ListNode node = head;
        while (index-- > 0) {
            node = node.next;
        }
        return node;
    }

    public int get(int index) {
        ListNode node = getNodeAtIndex(index);
        if (node == null) return -1;
        return node.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(getSize(), val);
    }

    public void addAtIndex(int index, int val) {
        int size = getSize();
        if (index > size) return;
        if (index == 0) {
            this.head = new ListNode(val, null, this.head);
            if (this.head.next != null) {
                this.head.next.prev = this.head;
            }
        } else if (index == size) {
            ListNode tail = getNodeAtIndex(size - 1);
            tail.next = new ListNode(val, tail, null);
        } else {
            ListNode indexNode = getNodeAtIndex(index);
            ListNode newNode = new ListNode(val, indexNode.prev, indexNode);
            indexNode.prev.next = newNode;
            indexNode.prev = newNode;
        }
        this.size++;
    }

    public void deleteAtIndex(int index) {
        ListNode node = getNodeAtIndex(index);
        if (node == null) return;

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            this.head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        this.size--;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;

    }
}

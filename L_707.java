class MyLinkedList {

 private ListNode tempHead;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        tempHead = new ListNode(-1);
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0) return -1;
        ListNode p = tempHead.next;
        for (int i = 0; i < index && p != null; i++) {
            p = p.next;
        }
        if (p == null) return -1;
        else return p.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = tempHead.next;
        tempHead.next = node;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode p = tempHead;
        while (p.next != null) p = p.next;
        p.next = node;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0) index = 0;
        ListNode p = tempHead;
        for (int i = 0; i < index && p != null; i++) {
            p = p.next;
        }
        if (p == null) return;
        ListNode node = new ListNode(val);
        node.next = p.next;
        p.next = node;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0) return;
        ListNode p = tempHead;
        for (int i = 0; i < index && p.next != null; i++) {
            p = p.next;
        }
        if (p.next == null) return;
        p.next = p.next.next;
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
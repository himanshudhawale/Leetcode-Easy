class MaxStack {

    DoublyLinkedList dll; 
    TreeMap<Integer, List<Node>> tree;
    /** initialize your data structure here. */
    public MaxStack() {
        tree = new TreeMap<>();
        dll = new DoublyLinkedList();
    }
    
    public void push(int x) {
        Node node = dll.push(x);
        if(!tree.containsKey(x))
            tree.put(x, new ArrayList<Node>());
        tree.get(x).add(node);
    }
    
    public int pop() {
        int val = dll.pop();
        List<Node> temp = tree.get(val);
        temp.remove(temp.size()-1);
        if(temp.isEmpty())
            tree.remove(val);
        
        return val;
    }
    
    public int top() {
        return dll.peek();
    }
    
    public int peekMax() {
        return tree.lastKey();
    }
    
    public int popMax() {
        int max = peekMax();
        List<Node> temp = tree.get(max);
        Node node = temp.remove(temp.size()-1);
        dll.remove(node);
        if(temp.isEmpty())
            tree.remove(max);
        
        return max;
        
    }
    
}

class DoublyLinkedList{
    Node head, tail;
    
    public DoublyLinkedList()
    {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev=head;
    }
    
    
    public Node push(int val)
    {
        Node x = new Node(val);
        x.next = tail;
        x.prev = tail.prev;
        tail.prev.next = x;
        tail.prev=x;
        return x;
    }
    
    public int peek()
    {
        return tail.prev.val;
    }
    
    public Node remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node;
    }
    
    public int pop()
    {
        return remove(tail.prev).val;
    }
    
}

class Node {
    int val;
    Node prev, next;
    public Node(int v){
        this.val=v;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
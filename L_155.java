class MinStack {

    private Node top = null;
   /** initialize your data structure here. */
   public MinStack() {
       top = null;
   }

   public void push(int x) {
       int min = x;
       if(top!=null&&top.min<x){
           min = top.min;
       }
       top = new Node(x,top);
       top.min = min;
   }

   public void pop() {
       top = top.next;
   }

   public int top() {
       return top.val;
   }

   public int getMin() {
       return top.min;
   }


   class Node{
       private final int val;
       private Node next;
       private int min;
       
       public Node(int val,Node next){
           this.val = val;
           this.next = next;
       }

       public int getVal(){
           return val;
       }

       public Node getNext(){
           return next;
       }


   }

}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(x);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/
class MovingAverage {

    int size;
    double sum = 0;
    Queue<Integer> q;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
         this.size = size;
         q = new LinkedList<Integer>();  
        
    }
    
    public double next(int val) {
        if(q.size() < size){
            sum += val;
            q.offer(val);
            return sum / q.size();
        }
        else{
            sum -= q.poll();
            sum += val;
            q.offer(val);
            return sum / q.size();
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
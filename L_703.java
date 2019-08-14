class KthLargest {

    public int kk;
    public PriorityQueue<Integer> q;
    
    public KthLargest(int k, int[] nums) {
        kk=k;
        q=new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            q.offer(nums[i]);
            if(q.size()>k)
            {
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size()>kk)
        {
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
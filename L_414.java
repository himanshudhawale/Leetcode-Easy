class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> mySet=new HashSet<Integer>();
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!mySet.contains(nums[i]))
            {
                mySet.add(nums[i]);
                q.add(nums[i]);
            }
            if(q.size()>3)
            {
                q.poll();
            }
        }
        
        Iterator itr=q.iterator();
        int key=0;
        if(q.size()<3)
        {
            while(itr.hasNext())
            {
            key=q.poll();
            }
            return key;
        }
        else
        {
            key=q.peek();            
        }
        
        return key;

    }
}
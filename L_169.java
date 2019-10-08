class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int half = nums.length/2;
        // int i=0;
        // for(i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i])>half)
        //         break;
        // }
        // return nums[i]; 
        
        int count =0;
        Integer candidate = null; 
        
        for(int num : nums)
        {
            if(count == 0)
                candidate = num; 
            
            count = count + (candidate == num ? 1 : -1);
        }
        return candidate; 
    }
}
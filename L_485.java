class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int localmax=0;
            while(nums[i]==1)
            {
                localmax++;
                i++;
                if(i==nums.length)
                    break;
            }
            max=Math.max(max,localmax);
            
        }
        return max;
    }
}
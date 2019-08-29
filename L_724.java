class Solution {
    public int pivotIndex(int[] nums) {
        int sum1=0, sum2=0;
        for(int x : nums)
            sum1+=x;
        for(int i=0;i<nums.length;i++)
        {
            if(sum2==sum1 - sum2 - nums[i])
                return i;
            sum2+=nums[i];
        }
        return -1;
    }
}
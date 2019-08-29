class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=max && max<2*nums[i])
                return -1;
        }
        return index;
        
    }
}
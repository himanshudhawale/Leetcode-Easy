class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int i=0, j=nums.length-1; 
        
        while(i<=j)
        {
            if(nums[i]==target && nums[j]==target)
                break; 
            if(nums[i]!=target)
                i++;
            if(nums[j]!=target)
                j--;
        }
        return (j-i+1)*2 > nums.length ? true : false; 
    }
}
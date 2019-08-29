class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;    //1,  2,  2,  3
                    // j, i
                    //1 , 2,   2, 3
                    //1, j,     i,
                    // 1, j,    ,  i
                    // 1, 2, 3
                    //  ,  , j,   i (j+1 return)
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
                // j++;
            }
                
        }
        return j+1;
    }
}
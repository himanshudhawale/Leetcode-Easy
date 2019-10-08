class Solution {
    public void rotate(int[] nums, int k) {
        // //size- k to size - k - 1
        // // 0 + 3 % 7 = 3
        // // 1 + 3 % 7 = 4
        // // 2 + 3 % 7 = 5
        // int[] arr = new int[nums.length]; 
        // for(int i=0 ;i <nums.length; i++)
        // {
        //     arr[(i+k)%nums.length] = nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = arr[i];
        // }
        
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    
}
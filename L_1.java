class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(target - nums[i], i);  //9-2=7;9-7=2
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null && i != map.get(nums[i])){
                int[] ar = {i, map.get(nums[i])};
                Arrays.sort(ar);
                return ar;
            }
        }
        return null;
    }
}


// 7,0   
//2,1    
//-2,2
//-6,3
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums2)
            set.add(i);
        
        HashSet<Integer> result = new HashSet<>(); 
        int j=0;
        for(int i : nums1)
        {
            if(set.contains(i))
                result.add(i);
        }
    	int[] ans = new int[result.size()];
        for(int i : result)
        {
            ans[j++] = i;
        }
        
    
    	return ans;
    }

}
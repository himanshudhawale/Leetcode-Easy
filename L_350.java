class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for (int i=0; i<nums1.length; i++) {
    		if (map.get(nums1[i])==null)
    			map.put(nums1[i],1);
    		else
    			map.put(nums1[i], map.get(nums1[i])+1);
    	}
    	
    	for (int j=0; j<nums2.length; j++) {
    		if (map.get(nums2[j])!=null && map.get(nums2[j])!=0) {
    			result.add(nums2[j]);
    			map.put(nums2[j], map.get(nums2[j])-1);
    		}
    	}
    	
    	int[] ans = new int[result.size()];
    	for (int k=0; k<ans.length; k++)
    		ans[k] = result.get(k);
    	return ans;
    
    }
}



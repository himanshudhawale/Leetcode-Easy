class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count1 = new int[1001];
		int[] count2 = new int[1001];
		int[] ans = new int[arr1.length];
		int k = 0;
    
		for (int num : arr1) count1[num]++;
		for (int num : arr2) count2[num]++;
    
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < count1[arr2[i]]; j++)
				ans[k++] = arr2[i];
		}
    
		for (int i = 0; i <= 1000; i++) {
			if (count1[i] != 0 && count2[i] == 0) {
				for (int j = 0; j < count1[i]; j++) {
					ans[k++] = i;
				}
			}
		}

		return ans;
    }
}
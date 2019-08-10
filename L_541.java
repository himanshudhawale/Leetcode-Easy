class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += 2 * k) {
            int m = i, j = Math.min(i + k - 1, a.length - 1);
            while (m < j) {
                char tmp = a[m];
                a[m] = a[j];
                m++;
                a[j] = tmp; 
                j--;
            }
        }
        return new String(a);
    }
}
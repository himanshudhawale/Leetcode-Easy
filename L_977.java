class Solution {
    public int[] sortedSquares(int[] A) {
        int left = 0; 
        int right = A.length -1;
        int index = A.length-1;
        int[] ans = new int[A.length];
        while(left<=right)
        {
            if(A[left]*A[left]>A[right]*A[right])
            {
                ans[index] = A[left]*A[left];
                left++;
            }
            else
            {
                ans[index] = A[right]*A[right];
                right--;
            }
            index--;
        }
        return ans;
        
    }
}
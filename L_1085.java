class Solution {
    public int sumOfDigits(int[] A) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<min)
                min=A[i];
        }
        // Arrays.sort(A);
        // int x = A[0];
        int sum=0;
        while(min!=0)
        {
            int rem = min%10;
            sum+=rem;
            min=min/10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
       
        for(int i=0;i<A.length;i++)
        {
            A[i] = reverse(A[i]);
            A[i] = flip(A[i]);
        }
        return A;
        
    }
    
    
    public int[] flip(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
                a[i]=0;
            else
                a[i]=1;
        }
        
        return a; 
    }
    
    public int[] reverse(int[] a)
    {
        int i=0, j=a.length-1;
        while(i<j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;j--;
        }
        return a; 
    }
}
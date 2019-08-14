class Solution {
    public int fixedPoint(int[] A) {
        int s=0, e=A.length-1;
        int k=binarySearch(s,e,A);
        return k;
    }
    
    public int binarySearch(int s, int e, int[] n)
    {
        if (s > e)
            return -1;
        int mid=(s+e)/2;
        if(mid==n[mid])
        {
            return mid;
        }
        if(mid<n[mid])
        {
           return binarySearch(s,mid-1,n); 
        }
        return binarySearch(mid+1,e,n);
    }
}
class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0;a*a<=c;a++)
        {
            int b=(c-(int)(a*a));
            if(binarysearch(0,b,b))
            {
                return true;
            }
        }
        return false;
        
    }
    public boolean binarysearch(long s,long e,int n)
    {
        if(s>e)
            return false;
        long m=(s+e)/2;
         if (m * m == n)
            return true;
        if (m * m > n)
            return binarysearch(s, m - 1, n);
        return binarysearch(m + 1, e, n);
    }
}
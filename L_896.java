class Solution {
    public boolean isMonotonic(int[] A) {
        if(A[A.length-1]>=A[0]){
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>=A[i-1]){
                continue;
            }else
            {
                return false;
            }
        }
        }
        else
        {
           for(int i=A.length-2;i>=0;i--)
           {
            if(A[i]>=A[i+1]){
                continue;
            }else
            {
                return false;
            }
           } 
        }
        return true;
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=binarySearch(0,nums.length-1,nums,target);
        
        return k; 
    }
    
    public int binarySearch(int s,int e,int[] n,int key)
    {
        if(s>e)
            return e+1;
        int mid=(s+e)/2;
        if(n[mid]==key)
            return mid;
        if(n[mid]>key)
            return binarySearch(s,mid-1,n,key);
        return binarySearch(mid+1,e,n,key);
        
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target){
                int[] a={i+1,j+1};
                return a;    
            } 
            if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
        }
        return null;
    }
}
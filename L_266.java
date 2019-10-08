class Solution {
    public boolean canPermutePalindrome(String s) {
     int[] count=new int[128];
        int res=0;
        for(char c:s.toCharArray())
        {
            count[c]++;
            if(count[c]%2==0)
                res--;
            else 
                res++;
        }
        
        return res<=1;
    }
}
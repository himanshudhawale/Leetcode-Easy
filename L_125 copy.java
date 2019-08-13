class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int size=s.length();
        if(size <= 1)
            return true;

        int j=size-1;
        outerloop:
        while(i<size && j>=0 && i<=j)
        {
            while(!Character.isLetterOrDigit(arr[i])){
                i++;
                if(i==size)
                    break outerloop;
            }
            while(!Character.isLetterOrDigit(arr[j])){
                j--;
                if(j==0)
                    break outerloop;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
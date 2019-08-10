class Solution {
    public void reverseString(char[] s) {
        //in place 
        //two pointers required j-- and i++
        int j=s.length-1;
        //iterate till half since j and i will meet halfway
        for(int i=0; i<s.length/2;i++)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
     
    }
}
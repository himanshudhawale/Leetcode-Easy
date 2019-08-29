class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        int carry=1;
        int result=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            int t = digits[i]+carry;
            int rem = t%10;
            carry=t/10;
            digits[i]=rem;
        }
        if(carry==1)
        {
            int[] x = new int[digits.length+1];
            x[0]=1;
            for(int i=1;i<digits.length+1;i++)
            {
                x[i]=digits[i-1];
            }
            return x;
        }
        return digits;
    }
}
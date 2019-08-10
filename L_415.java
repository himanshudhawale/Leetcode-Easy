class Solution {
    public String addStrings(String num1, String num2) {
        int x = num1.length() - 1;
        int y = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        int carry=0;
        while(x>=0 || y>=0)
        {
            int sum=carry;
            if(x>=0)
            {
                sum=sum+Character.getNumericValue(num1.charAt(x));
                x--;
            }
            if(y>=0)
            {
                sum=sum+Character.getNumericValue(num2.charAt(y));
                y--;
            }
            sb.append(sum%10);
            carry=sum/10;
        }
        if(carry!=0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
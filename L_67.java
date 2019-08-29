class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = new StringBuilder();

        StringBuilder sb2 = new StringBuilder();

        int alen=a.length()-1;
        int blen=b.length()-1;
        if(alen<blen)
        {
            while(alen!=blen){
            sb1.append("0");
            alen++;
            }
        }
        else
        {
            while(alen!=blen){
            sb2.append("0");
            blen++;
            }
        }
        sb1.append(a);
        sb2.append(b);
        String a1=sb1.toString();
        String b1=sb2.toString();
        int carry=0;
        for(int i=alen; i>=0; i--)
        {
            int x=(int)a1.charAt(i)-'0';
            int y=(int)b1.charAt(i)-'0';
            int sum=x+y+carry;
            if(sum==2)
            {
                sb.append(0);
                carry=1;
            }
            else if(sum==3)
            {
                sb.append(1);
                carry=1;
            }
            else
            {
                sb.append(sum);
                carry=0;
            }
        }if(carry==1)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
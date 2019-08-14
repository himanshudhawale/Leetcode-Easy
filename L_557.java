class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String strArr[] = s.split(" ");
        int count=strArr.length-1;
        for(String str : strArr)
        {
            sb.append(reverseWord(str));
            if(count!=0)
            {
                sb.append(" ");
            }
            count--;
        }
        return sb.toString();
    }
    
    public String reverseWord(String s){
        // StringBuilde sb = new StringBuilder();
        char[] cArr=s.toCharArray();
        int j=cArr.length-1;
        for(int i=0;i<cArr.length/2;i++)
        {
            char temp=cArr[i];
            cArr[i]=cArr[j];
            cArr[j]=temp;
            j--;
        }
        return new String(cArr);
     
    }
}
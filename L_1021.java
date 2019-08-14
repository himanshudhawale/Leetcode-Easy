class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int flag=0;
        for(char x:S.toCharArray())
        {
            if(x=='(' && flag++>0)
            {
                sb.append(x);
            }
            if(x==')' && flag-->1)
            {
                sb.append(x);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(isVowel(c))
            {
                stack.push(c);
            }
        }
        char[] cs = s.toCharArray();
        for(int i=0;i<cs.length;i++)
        {
            if(isVowel(cs[i]))
            {
                cs[i]=stack.pop();
            }
        }
        return String.valueOf(cs);
    }
    public boolean isVowel(char c)
    {
         c=Character.toUpperCase(c);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
}
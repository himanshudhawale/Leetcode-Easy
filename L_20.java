class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
               if(!(st.isEmpty()) && st.peek() == reverse(c))   //check if not empty and also the first
               //element of stack is equal to reverse of parathensis
                    st.pop();
                else
                    return false;
            }
            
        }
       return st.isEmpty();
    }
    
    public char reverse(char c)
    {
        if(c==')')
            return '(';
        else if(c==']')
            return '[';
        else 
            return '{';
    }

}
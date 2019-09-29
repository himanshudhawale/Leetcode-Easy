
//use Stack 

class Solution {
    public String removeDuplicates(String S) {
        
        Stack<Character> stack = new Stack<>();
        for(char c: S.toCharArray())
        {
            if(stack.isEmpty())
                stack.push(c);
            else if(stack.peek()==c)
                stack.pop();
            else
                stack.push(c);
        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        
        return sb.reverse().toString();
    }
}


//StringBuilder as Stack
class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int length=0;
        for(char c: S.toCharArray())
        {
            if(length!=0 && sb.charAt(length-1)==c)
            {
                sb.deleteCharAt(length-1);
                length--;
            }
            else{
                sb.append(c);
                length++;
                
            }
                
        }  
        return sb.toString();
    }
}
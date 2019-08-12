class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        Stack<Character> mystack = new Stack<Character>();
        for(int i=0;i < arr.length; i++)
        {
            if(Character.isLetter(arr[i]))
            {
                mystack.push(arr[i]);
            }
        }
       for(int i=0;i < arr.length; i++)
        {
            if(Character.isLetter(arr[i]))
            {
                arr[i]=mystack.pop();
            }
        }
        return String.valueOf(arr);
    }
    
}
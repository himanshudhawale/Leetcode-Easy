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


//100% faster solution is to do in-place sorting with two pointers
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int j=S.length()-1;
        int i=0;
        if(S.length()==0 || S==null)
            return "";
        while(i<=j)
        {
            if(!Character.isLetter(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetter(arr[j])){
                j--;
                continue;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        
        }
        return String.valueOf(arr);
    }
    
}
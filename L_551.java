class Solution {
    public boolean checkRecord(String s) {
        //using stack to check indexOf and lastIndexOf
        //if they are not same, it means, we have more than one A 
        // in our stack
        Stack<Character> mstack= new Stack<Character>();
        if(s.indexOf('A')!=s.lastIndexOf('A'))
        {
            return false;
        }
        //count to keep track of continuous L
        int count=0;
        for(char c : s.toCharArray())
        {
            if(c=='L')
            {
                count++;
                if(count==3)
                    break;
            }
            else{
                count=0;
            }
        }
        if(count==3)
            return false;
      
        return true;
        
    }
}
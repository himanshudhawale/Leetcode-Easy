//Input: "Hello World"
//Output: 5  (count of world)
class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null)
        {
            return 0;
        }
        
        int count =0 ;
        int flag=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(count==0)
                    continue;
                return count; 
            }
            count++;
        }
        return count;
    }
}



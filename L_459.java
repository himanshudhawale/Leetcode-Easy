class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //check from the middle of string to first character
        for(int i=s.length()/2 ; i>0 ; i--)
        {
            //skip some part of computation
            //where length of string is not divisible by i 
            //example abababa
           if(s.length()%i!=0)
           {
               continue;
           }
            String str = s.substring(0,i); 
            String[] arr = s.split(str);
            if(arr.length == 0)
                return true;
        }
        return false;
    }
}
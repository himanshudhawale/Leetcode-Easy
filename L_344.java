class Solution {
    public void reverseString(char[] s) {
        //in place 
        //two pointers required j-- and i++
        int j=s.length-1;
        //iterate till half since j and i will meet halfway
        for(int i=0; i<s.length/2;i++)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
     
    }
}

//recursion 

class Solution {
    public void reverseString(char[] s) {
        myfunction(0,s.length -1, s);
    }
    public void myfunction(int start, int end, char[] s)
    {
        if(start>=end)
            return;
        char temp = s[start];
        s[start]= s[end];
        s[end] = temp;
        
        myfunction(start+1,end-1,s);
    }
}
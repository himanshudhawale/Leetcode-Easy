class Solution {
    public int countPrimes(int n) {
        int c=0;
        int flag=1;
       for (int i=2; i<n; i++) 
       {
           flag=1;
        for (int j=2; j<i; j++)
        {
            if (i % j == 0) 
            {
                flag=0;
                break;
            }
        } 
           if(flag==1)
           {
               c++;
           }
           
       }
        return c;
        
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> mylist = new ArrayList<Integer>(); 
        for(int i=A.length-1;i>=0;i--)
        {
            if(i>=0)
            {
                K+=A[i];
            }
            mylist.add(K%10);
            K/=10;
        }
        while(K!=0)
        {
            mylist.add(K%10);
            K/=10;
        }
        // while(K!=0)
        // {
        //     mylist.add(K%10);
        //     K/=10;
        // }
        Collections.reverse(mylist);
        return mylist;
    }
}
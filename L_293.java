class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> mylist=new ArrayList<String>();
        char[] cArr=s.toCharArray();
        for(int i=0;i<cArr.length-1;i++)
        {
            if(cArr[i]=='+' && cArr[i+1]=='+')
            {
                cArr[i]='-';
                cArr[i+1]='-';
                mylist.add(new String(cArr));
                cArr[i]='+';
                cArr[i+1]='+';
            }
        }
        return mylist;
    }
}
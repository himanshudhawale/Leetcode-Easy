class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(char c1: J.toCharArray())
        {
            for(char c2: S.toCharArray())
            {
                if(c1==c2)
                    count++;
            }
        }
        return count;
    }
}
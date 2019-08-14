class Solution {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;
        for(char c : moves.toCharArray())
        {
            if(c=='U')
            {
                x++;
            }
            else if(c=='D')
            {
                x--;
            }
            else if(c=='R')
            {
                y++;
            }
            else if(c=='L')
            {
                y--;
            }
            else{
                x=0;
                y=0;
            }
        }
        return (x==0) && (y==0);
    }
}
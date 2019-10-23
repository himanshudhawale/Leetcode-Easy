class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double m, slope;
        if(coordinates[0][0]-coordinates[1][0]!=0)
        {
            m = (coordinates[0][1] - coordinates[1][1])/(coordinates[0][0]-coordinates[1][0]);
        }else{
            m=Double.MAX_VALUE;
            slope=Double.MAX_VALUE;
        }
        
        for(int i=1; i<coordinates.length;i++)
        {
            if(((double)(coordinates[i-1][0]-coordinates[i][0]))!=0)
            {
                slope = ((double)(coordinates[i-1][1] - coordinates[i][1]))/((double)(coordinates[i-1][0]-coordinates[i][0]));
            }else{
                slope=Double.MAX_VALUE;
            }
            if(slope!=m)
                return false;
        }
        return true;
    }
}
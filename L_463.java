class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        int count=0;
        int length=grid.length;
        int size=grid[0].length;
        for(int i=0;i<length;i++){
            for(int j=0;j<size;j++){
                if(grid[i][j]==1){
                    count+=4;
                    if(i>0&&grid[i-1][j]==1){
                        count-=2;
                    }
                    if(j>0&&grid[i][j-1]==1){
                        count-=2;
                    }
                }
            }
        }
        return count;
    }
}
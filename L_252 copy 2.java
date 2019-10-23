class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
         Arrays.sort(intervals, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
             int result = Integer.compare(o1[0], o2[0]);
             return result;
             
            }
        });
        
        int i=0; 
        while(i<intervals.length-1)
        {
            if(intervals[i][1]>intervals[i+1][0])
                return false;
            i++;
        }
        return true;
    }
    
}
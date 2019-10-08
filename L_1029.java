class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Comparator comp = new Comparator<int[]>() {
            public int compare(int[] a, int[]b){
                return Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
            }
        };
        int n  = costs.length/2;
        int ans = 0;
        int countA = 0; int countB = 0;
        Arrays.sort(costs, comp);
        
        for(int i = 0; i < costs.length; i++){
            if(countA < n && countB < n){
                if(costs[i][0] < costs[i][1]){
                    countA++;
                    ans += costs[i][0];
                }
                if(costs[i][0] >= costs[i][1]){
                    countB++;
                    ans += costs[i][1];
                }                
            }
            else if(countA < n){
                countA++; 
                ans += costs[i][0];
            }
            else if(countB < n){
                countB++;
                ans += costs[i][1];
            }
        }
        
        return ans;
    }
}
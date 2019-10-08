class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for (int[] item : items) {
            if (!map.containsKey(item[0])) {
                map.put(item[0], new PriorityQueue<>(5));
            }
            
            PriorityQueue<Integer> pq = map.get(item[0]);
            pq.offer(item[1]);
            if (pq.size() > 5) {
                pq.poll();
            }
        }
        
        int[][] ans = new int[map.size()][2];
        
        int i = 0;
        for (int id : map.keySet()) {
            int sum = 0;
            for (int s : map.get(id)) {
                sum += s;
            }
            
            ans[i++] = new int[]{id, sum / 5};
        }
        
        return ans;
    }
}
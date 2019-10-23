class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] arr=paragraph.split("\\W+");
        Map<String,Integer> hashMap=new HashMap<>();
       
        for(String str:arr)
        {
            // str=str.trim();
            str=str.replaceAll("[^A-Za-z]+", "").toLowerCase();
            hashMap.put(str,hashMap.getOrDefault(str,0)+1);
        }
        //System.out.println(hashMap);
        
        Set<String> banned_words=new HashSet<>();
        for(String str:banned)
            banned_words.add(str);
        
        PriorityQueue<String> pq=new PriorityQueue<>(
            (o1,o2)-> hashMap.get(o2) - hashMap.get(o1));
        
        for(String s : hashMap.keySet())
        {
           if(!banned_words.contains(s))
               pq.add(s);
        }
      
        return pq.peek();
        
    }
}
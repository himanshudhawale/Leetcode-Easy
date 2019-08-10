class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        int n = s.length();
        for(int i=0; i< n;i++)
        {
            char c = s.charAt(i);
            myMap.put(c,myMap.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<n; i++)
        {
            if(myMap.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}
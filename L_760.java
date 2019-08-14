class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int size=A.length;
        int P[]=new int[size];
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            hmap.put(B[i],i);
        }
        
        int x=0;
        for(int i:A)
        {
            P[x]=hmap.get(i);
            x++;
        }
        
        return P;
    }
    
    
}
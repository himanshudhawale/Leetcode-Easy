class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0)
			return true;
		if (magazine == null || magazine.length() == 0)
			return false;
        
        int[] table = new int[256];
        for(char c : magazine.toCharArray())
        {
            table[c]++;
        }
         for(char c : ransomNote.toCharArray())
        {
            if(table[c]==0)
                return false;
             else
                 table[c]--;
        }
      return true;
    }
}
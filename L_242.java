class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        int[] a = new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        // for(char c : t.toCharArray())
        // {
        //    a[c -'a']--;
        // }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
                return false;
        }
        return true;
    }
}

//Use hashtable for unicode
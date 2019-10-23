class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        int i = 0;
        
        while (i < chars.length) {
            char currChar = chars[i];
            int count = 0;
            
            while(i < chars.length && chars[i] == currChar) {
                i++;
                count++;
            }
            
            chars[ans++] = currChar;
            
            if (count != 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[ans++] = c;
                    // ans++;
                }
            }
        }
        
        return ans;
    }
}
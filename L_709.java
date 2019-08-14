class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray())
        {
            
            int z=(int)x;
            if(z>=65 & z<=91)
            {
                z+=32;
            }
            sb.append((char)z);
        }
        return sb.toString();
    }
}
class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        String column = "";
        char letter; 
        int r;    //remainder
        while (n != 0){ 
            r = n % 26;
            if (r == 0){
                r = 26;
            }
            letter = (char) ('A' + r-1); 
            sb.insert(0,letter);
            // column = letter + column; 
            n = n-r;
            n = n/26; //integer division
        }
        
        return sb.toString();
    }
}
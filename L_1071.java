class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //This is a recursion problem
        //if str1 is smaller then find gcd of str2 w.r.t str1
        if (str1.length() < str2.length())
            return gcdOfStrings(str2, str1);    
        //if str's length is zero, then return str1
        if (str2.length() == 0)
            return str1;
        //if not equal return ""
        if (!str1.substring(0, str2.length()).equals(str2)) {
            return "";
        } 
        //else recursively call substring
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}
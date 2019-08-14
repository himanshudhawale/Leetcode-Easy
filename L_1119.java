class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray())
        {
            if(!(isVowel(c)))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public Boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        else{
            return false;
        }
    }
}
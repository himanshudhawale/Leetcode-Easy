class Solution {
    public String countAndSay(int n) {
        if(n<1)
            return "";
        else if(n==1)
            return "1";
        else if(n==2)
            return "11";
        else{
            String ans = "11";
            for(int i=3; i<=n;i++)
            {
                ans=getString(ans);
            }
            return ans;
        }  
    }
    
    public String getString(String ans){
        StringBuilder sb = new StringBuilder();
        int i=1, count=1;
        char[] c = ans.toCharArray();
        char current = c[0];
        
        for(i=1;i<c.length;i++)
        {
            if(c[i]==current)
                count++;
            else{
                sb.append(count);
                sb.append(current);
                count=1;
                current=c[i];
            }
        }
        sb.append(count);
        sb.append(current);
        
        return sb.toString();
    }
    
}
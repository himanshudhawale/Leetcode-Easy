class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> mySet= new HashSet<String>();
        for(int i=0;i<emails.length;i++)
        {
            String[] strArr=emails[i].split("@");
            String domainName=strArr[1];
            String localName=strArr[0];
            localName=localName.replaceAll("\\.","");
            localName=localName.split("\\+")[0];
            mySet.add(localName+"@"+domainName);
        }
        return mySet.size();
    }
}
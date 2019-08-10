class Solution {
    public int romanToInt(String s) {
        //Create hashmap and add all characters (Roman numerals)
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        //if string is empty return
        if(length == 0 || s == null)
        {
            return 0; 
        }
        int sum = 0, temp=0;
         
        for(int i = length - 1; i >= 0; i--){
        int cur = map.get(s.charAt(i));
        //add if last character since sum is 0
        if(i == length - 1){
            sum = sum + cur;
        }else{
            //substract for case like IV or IX
           if(cur < temp){
               sum = sum - cur;
           }
            //else add all values
            else{
               sum = sum + cur;
           }
        }
        temp = cur;
    }
    
        return sum;
    }
}
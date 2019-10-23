class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] table = new int[26]; 
        int count=0;
        for(char c : text.toCharArray())
        {
            table[c-'a']++;
        }
        for(char c : "balon".toCharArray()){
            if(check(c,table)){
                count++;
            }
        }
        
        if(count == 5){
            int min = Math.min(table['b'-'a'],Math.min(table['a'-'a'],table['n'-'a']));
            int minRepeated = Math.min(table['l'-'a'],table['o'-'a']);
            return Math.min(min, minRepeated/2);
        }
        return 0;
        
        
    }
    
    
    public static boolean check(char c,int[] a){
        switch(c){
            case 'b':
                if(a['b'-'a'] > 0)
                    return true;
            case 'a':
                if(a['a'-'a'] > 0)
                    return true;
            case 'l':
                if(a['l'-'a'] >= 2)
                    return true;
            case 'o':
                if(a['o'-'a'] >= 2)
                    return true;
            case 'n':
                if(a['n'-'a'] > 0)
                    return true;
        }
        return false;
    }
}
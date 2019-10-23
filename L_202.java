class Solution {
    public boolean isHappy(int n) {
        List<Integer> numList = new ArrayList<>();
        int n_original = n;

        while(true){
            n = calculateSquareOfDigits(n);
            if(n == 1){
                return true;
            }
            else if(numList.contains(n)){
                return false;
            }
            numList.add(n);
        }
    }
    public int calculateSquareOfDigits(int n){
        int result = 0;
        while(n > 0){
            int rem = n % 10;
            result += rem * rem;
            n = n / 10;
        }
        return result;
    }
}
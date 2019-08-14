/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int k=binarySearch(1,n);
        return k;
        
    }
    public int binarySearch(int s, int e)
    {
        if(s>e)
            return -1;
        int mid=(s+e)/2;
        if(guess(mid)==0)
            return mid;
        if(guess(mid)==1)
            return binarySearch(mid+1,e);
        
        return binarySearch(s,mid-1);
    }
}
package recursion;
import java.util.*;
import java.lang.*;
public class friendsPairingProblem {
    public static int friendsPairing(int n) {
        //base case
        if(n == 1 || n==2) {
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 +pairways;
        return totalWays;
    }

    public static int friendPair(int n) {
        if( n == 1 || n == 2) {
            return n;
        }
        return friendPair(n-1) + (n-1)*friendPair(n-2);
    }
    public static void main(String[] args) {

    }
}

package recursion;
import java.util.*;
import java.lang.*;
public class tilingProblem {
    public static int totalWays(int n ) {
        //base case
        if(n == 1 || n ==0) {
            return 1;
        } 
        //kaam
        //vertical choice
        int fnm1 = totalWays(n-1);
        //horizontal choice
        int fnm2 = totalWays(n-2);

        int ttlWays = fnm1 + fnm2;
        return ttlWays;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        int getValue = totalWays(n);
        System.out.println("the total number of ways are: "+getValue);
    }
}

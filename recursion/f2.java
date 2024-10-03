package recursion;
import java.util.*;
import java.lang.*;
public class f2 {
    public static void printIncreasing(int n) {
        if(n==1) {
            System.out.print(1+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n) {
        /*if(n == 0) {
            return 1;
        }
        return n*factorial(n-1);
        */
        
        if(n == 0) {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        printIncreasing(n);
        System.out.println();
        System.out.println("factorial of "+n+" is: "+factorial(n));
    }
}

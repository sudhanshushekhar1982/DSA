package recursion;
import java.util.*;
import java.lang.*;
public class f3 {
    public static int fib(int n) {
        if( n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        return (fibnm1 + fibnm2);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n =sc.nextInt();
        int m = fib(n);
        System.out.println("the value of fibonacci is : "+m);
    }
}

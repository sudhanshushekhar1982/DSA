package recursion;
import java.util.*;
import java.lang.*;
public class f1 {
    public static void decreasingOrder(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void main(String [] args) {
        int n;
        System.out.print("enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        decreasingOrder(n);
    }
}

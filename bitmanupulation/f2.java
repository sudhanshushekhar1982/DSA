package bitmanupulation;
import java.util.*;

public class f2 {
    public static void evenOdd(int n ) {
        int bitMask = 1;
        if(n == 0) {
            System.out.println("the given number is zero which is neigther even nor odd!");
         } else if((n & bitMask) == 1) {
            System.out.println("the given number is odd ");
         } else {
            System.out.println("the given numbet is even");
         }
    }
    public  static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the value of the number:");
     int n  = sc.nextInt();
     evenOdd(n);
     
    }
}

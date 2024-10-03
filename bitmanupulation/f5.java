package bitmanupulation;
import java.util.*;
public class f5 {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the n:");
        int n = sc.nextInt();

    }
}

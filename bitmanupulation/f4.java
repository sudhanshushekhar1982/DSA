package bitmanupulation;
import java.util.*;
public class f4 {
    public static int setIthPos(int n ,int i) {
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n,int i) {
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthPos(n, i);
        }
    }
    public static int clearBits(int n,int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearBitsInRange(int n,int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the vcalue of n:");
        // int n =  sc.nextInt();
        // System.out.println("enter the v alue of i:");
        // int  i = sc.nextInt();
        System.out.println(setIthPos(10, 2));
        System.out.println(clearBits(4, 2));
    }
}

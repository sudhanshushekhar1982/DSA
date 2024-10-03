package bitmanupulation;
import java.util.*;
public class f1 {
    public static void main(String[] args) {
        int a  =5;
        int b = 6;

        //bitwise and operator
        System.out.println(a & b);
        //bitwise or operator
        System.out.println(a | b);
        //binary xor operator
        System.out.println(a^b);
        //binary one's compliment and two's operator
        System.out.println(~a+1); 
        //binary left hift operator // a<<b =(a*2^b)
        System.out.println(5<<3);
        //binary right shift operator // a>>b =  a/2^b
        System.out.print(6>>1);
    }
}

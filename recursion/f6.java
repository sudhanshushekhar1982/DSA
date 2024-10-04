package recursion;
import java.util.*;
import java.lang.*;
public class f6 {
    public static int expo(int b,int e) { // time complexity O(2^n)
        if(e == 0) {
            return 1;
        }
        return (b*expo(b, e-1));
    }
    public static int optimizedPower(int a,int n) { // O(logn)
        if(n == 0) { 
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSquare = optimizedPower(a, n/2)*halfPower;
        //if n is odd
        if(n % 2 != 0) {
            halfPowerSquare = a*halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int b,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of b:");
        b=sc.nextInt();
        System.out.print("enter the value of the e:");
        e = sc.nextInt();
        int valueCalculated = expo(b, e);
        System.out.print("the value of"+b+"to the power"+e+"is:"+valueCalculated);

        int newValue = optimizedPower(b, e);
        System.out.println();
        System.out.println(newValue);
    }    
}

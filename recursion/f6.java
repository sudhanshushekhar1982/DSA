package recursion;
import java.util.*;
import java.lang.*;
public class f6 {
    public static int expo(int b,int e) {
        if(e == 0) {
            return 1;
        }
        return (b*expo(b, e-1));
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
    }    
}

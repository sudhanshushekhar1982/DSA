package strings;
import java.util.*;
public class f3 {
    public static void main(String[] args) {
        String s1 = "sudhanshu";
        String s2 = "sudhanshu";
        String s3 = new String("sudhanshu");

        // if(s1 == s2) {
        //     System.out.println("strings are equal!");
        // } else {
        //     System.out.println("strings are not equal!");
        // }

        if(s1.equals(s3)) {
            System.out.println("strings are equal!");
        } else {
            System.out.println("strings are not equal!");
        }
    }
}

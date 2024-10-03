package strings;
import java.util.*;
public class f1 {
    public static void printletters(String str) {
        for(int i =0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }


    public static boolean ispalindrome(String str) { //O(n)
        int start =0 ;
        int end = str.length()-1;
        int mid = start+end/2;
        while(start <= mid) {
            if(str.charAt(start) !=str.charAt(end)) {
                System.out.println("given string is not palindrome!");
                return false;
            }
            start++;
            end--;
        }
        System.out.println("given string is palindrome!");
        return true;
    }

    
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str  = "abcd";
        String str2 = new String("heritage institute of technology");
        //strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.print("enter your name please:");
        // name = sc.nextLine();
        // System.out.println(name.length());

        //concatinate

        // String firstname = "sudhanshu";
        // String lastname = "shekhar";
        // String fullname = firstname+" " +lastname;
        // //System.out.println(fullname.charAt(0));

        // printletters(fullname);

        ispalindrome("raceca");
    }
}
 
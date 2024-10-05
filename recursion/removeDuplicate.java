package recursion;
import java.util.*;
import java.lang.*;
public class removeDuplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    } 
    // public static void removeduplicate(String str,int idx,StringBuilder newStr,boolean map[]) {
    //     if(idx == str.length()) {
    //         System.out.println(newStr);
    //         return;
    //     }
    //     //kaam
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true) {
    //         removeduplicate(str, idx+1, newStr, map);
    //     } else {
    //         map[currChar - 'a'] = true;
    //         removeduplicate(str, idx+1, newStr.append(currChar), map);
    //     }
    // }
    // public static void remDup(String str , int idx,StringBuilder newStr,boolean map[]) {
    //     //base case
    //     if(idx == str.length()) {
    //         System.out.println(newStr);
    //         return;
    //     }
    //     //kaam 
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true) {
    //         remDup(str, idx+1, newStr, map);
    //     } else {
    //         map[currChar - 'a'] = true;
    //         remDup(str, idx+1, newStr.append(currChar), map);
    //     }
    //}
    public static void main(String [] args) {
        String str = "dheerajshandilya";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

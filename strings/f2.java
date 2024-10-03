//given a route containing 4 directions(e,w,n,s) find the shortest path to reach destination("wnwwnwsennn")
package strings;
import java.util.*;
public class f2 {
    public static double shortest(String str) {//O(n)
        int x =0;
        int y=0;
        for(int i =0;i<str.length();i++) {
            if(str.charAt(i) == 'n') {
                y++;
            }
            if(str.charAt(i) == 's') {
                y--;
            }
            if(str.charAt(i) == 'e') {
                x++;
            }
            if(str.charAt(i) == 'w') {
                x--;
            }
        }
        double shortestPath = Math.sqrt((x*x)+(y*y));
        return shortestPath;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the direction string");
        String str = "wneenesennn"; 
        System.out.println(shortest(str));
    }
}

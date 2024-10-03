package bitmanupulation;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class f3 {
    public static int getIthbit(int n,int i) {
        int bitMask = (1<<i);
        if((n & bitMask) == 0) {
            return 0;
        } else  {
            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        System.out.println("enter the position to get the bit value:");
        int i = sc.nextInt();
        System.out.println(getIthbit(n,i));
    }
}

import java.util.*;
public class f6 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int count = 0;
        for(int i =0;i<=arr.length-1;i++){
            for(int j =i+1;j<=arr.length-1;j++){
                System.out.print("["+arr[i]+","+arr[j]+"]");
                count++;
            }
            System.out.println();
        }
        System.out.println("total number of possible pairs are:"+count);
    }
}

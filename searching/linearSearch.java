package searching;
import java.util.*;
import java.lang.*;
public class linearSearch {
    public static int linearsearch(int arr[],int key) {
        for(int i =0;i<arr.length;i++) {
            if(key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,21,1};
        System.out.println(linearsearch(arr, 1));
    }
}

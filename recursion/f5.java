package recursion;
import java.util.*;
import java.lang.*;
public class f5 {
    public static int firstOccurence (int arr[],int key,int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i) {
        if(i == 0) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr [] = {8,5,3,6,9,5,5};
        int n = firstOccurence(arr, 5, 0);
        System.out.println("the value of index at whch the key is found is: "+n);
        int m = lastOccurence(arr, 5, arr.length-1);
        System.out.println(m);
    }
}

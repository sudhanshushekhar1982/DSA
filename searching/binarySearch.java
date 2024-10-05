package searching;
import java.util.*;
import java.lang.*;
public class binarySearch {
    public static int binarysearch(int arr[],int key) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid]  == key) {
                return mid;
            } else if(arr[mid] < key) {
                start = mid + 1;    
            }  else {
                end = mid - 1;   
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarysearch(arr, 6));
    }
}

import java.util.*;
public class f4 {
    public static  int binarySearch(int arr[],int key){
        // int start = 0;
        // int end = arr.length-1;
        // // int mid = (start+end)/2;
        // int mid = (start+end)/2;
        // while(start<=end){
        //     // int mid = (start+end)/2;
        //     if(arr[mid] == key) {
        //         return mid;
        //     }
        //      if(arr[mid]<key){
        //         start=mid+1;
        //     } else {
        //          end = mid-1;
        //      } 
        // }
        // return mid;

        // int start = 0;
        // int end = arr.length-1;
        // while (start<=end) {
        //     int mid = (start+end)/2;

        //     if(arr[mid] == key) {
        //         return mid;
        //     }
        //     if(arr[mid] < key) {
        //         start = mid+1;
        //     } else {
        //         end = mid - 1;
        //     }
        // }
        // return -1;

        // 
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /* Binary search */
        int arr[] = {10,12,14,16,8,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of key:");
        int key =sc.nextInt();
        int val = binarySearch(arr, key);
        // System.out.println(val);
        if(val == -1) {
            System.out.println("key does not exists in the given array!");
        } else {
            System.out.println("key is found at position:"+val);
        }
    }
}

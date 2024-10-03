import java.util.*;
public class f3 {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("the smallest value of the given array is:"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,14,16,8,7,9};
        int largest = largest(arr);
        System.out.println("the largest value in the array is: "+largest);
    }
}

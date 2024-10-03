import java.util.*;
public class f5 {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,1};
        int start =0;
        int end = arr.length-1;
        // int mid = (start+end)/2;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

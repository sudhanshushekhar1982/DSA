import java.util.Scanner;

public class f2 {
    public static int linearSearch(int arr[],int key){
        // key = 10;
        // int i;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key) {
                //System.out.println("key is found at:"+(i+1)+"position");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {2,4,6,8,10,12,14,16};
        // int key = 10;
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i] == key) {
        //         System.out.println("key is found at:"+(i+1)+"position");
        //         break;
        //     }
        // }
        System.out.println("enter the value of key:");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("key not found");
        }
        System.out.println("key is at index:"+(index+1));
    }
}

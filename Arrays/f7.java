import java.util.*;
public class f7 {
    public static void printSubarray(int arr[]){
        int count = 0;
        int largestSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                int sum =0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                    if(sum>largestSum) {
                        largestSum = sum;
                    }
                }
                System.out.println("]");
                System.out.println("sum of subarray is:"+sum);
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(count);
        System.out.println("the largest subarray sum is:"+largestSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int count=0;
        // for(int i =0 ;i<=arr.length-1;i++) {
        //     for(int j=i;j<=arr.length-1;j++){
        //         if(i==j){
        //             System.out.print("["+arr[i]+"]");
        //             count++;
        //         }else{
        //             System.out.print("["+arr[i]+","+arr[j]+"]");
        //             count++;
        //         }
                
        //     }
        //     System.out.println();
        // }
        // System.out.println(count);

        printSubarray(arr);
    }
}

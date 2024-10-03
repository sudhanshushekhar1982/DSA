package sorting;
import java.util.*;
public class bubbleSort {
    public static void bubbleSort(int arr[]){
        int round1=0,round2=0;
        for(int turn = 0; turn < arr.length-1; turn++){
            round1++;
            for(int j = 0 ; j < arr.length-1-turn; j++){
                //swap
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                round2++;
            }
        }
        System.out.println(round1+" "+round2);
    }
    public static void print(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        print(arr);
    }
}

/*
//early termination


    public class OptimizedBubbleSort {
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break the loop
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}





//tracking last swapped position
public class OptimizedBubbleSortWithLastSwap {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        int lastSwapIndex = n - 1;

        while (lastSwapIndex > 0) {
            int newLastSwapIndex = 0;
            for (int j = 0; j < lastSwapIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    newLastSwapIndex = j;
                }
            }
            lastSwapIndex = newLastSwapIndex;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

 */

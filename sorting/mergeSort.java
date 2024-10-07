package sorting;

public class mergeSort {
    public static void mergesort(int arr[],int si,int ei) {
        //base case
        if(si>=ei) {
            return;
        }
        //kaam
        int mid = si + (ei - si)/2;//finding mid
        mergesort(arr, si, mid); // left part
        mergesort(arr, mid+1, ei); //right part sorting by recursion
        //merging the sorted right and left
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        //left (0,3) = 4 and right(4,6)=3 -> 6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si;//iterator for the left part
        int j = mid+1;//iterator for the right part
        int k = 0;//iterator for the temporary array

        while(i<=mid && j <=ei) {
            if(arr[i] < arr[j]) {
                 temp[k] = arr[i];
                 i++;
                 k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        //left part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to the original array
        for(k = 0,i=si;k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]) {
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

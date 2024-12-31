import java.sql.Array;
import java.util.*;
public class stack_nextGreater {
    //this code is primarily for the greatest in the right
    //but we can also find the greater from the left just by reversing the direction of the loop
    //brute force approach O(n*n)
    public static int[] nextGreat(int arr[]) {
        int result[] = new int[arr.length];
        int ct=0;
        for(int i =0;i<arr.length-1;i++) {
            int count =0;
            for(int j=i+1;j<arr.length;j++) {
                count = 0;
                if(arr[i] < arr[j]) {
                    result[i] = arr[j];
                    count++;
                    break;
                }
                ct++; //this will count the iteraions
            }
            if(count == 0) {
                result[i] = -1;
            }
        }
        result[arr.length-1] = -1;
        System.out.println(ct);
        return result;
    }
    

    //better approach O(n)
    public static int[] nxtgt(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        int ct = 0;
        for(int i = arr.length-1;i>=0;i--) {
            //1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
                ct++; //this will count the iterations
            }
            //2 if-else 
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        System.out.println(ct);
        return nxtGreater;
    }


    //code for finding the left closest greatest

    public static int[] lftnxtgt(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        int ct = 0;
        for(int i=0;i<arr.length-1;i++) {
            //1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
                ct++; //this will count the iterations
            }
            //2 if-else 
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        System.out.println(ct);
        return nxtGreater;
    }


    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3,6,6};
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr.length];
        // for(int i = arr.length-1;i>=0;i--) {
        //     //1 while
        //     while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
        //         s.pop();
        //     }
        //     //2 if-else 
        //     if(s.isEmpty()) {
        //         nxtGreater[i] = -1;
        //     } else {
        //         nxtGreater[i] = arr[s.peek()];
        //     }
        //     //3 push in s
        //     s.push(i);
        // }

        // for(int i = 0;i<nxtGreater.length;i++) {
        //     System.out.print(nxtGreater[i]+" ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(nextGreat(arr)));
        System.out.println(Arrays.toString(nxtgt(arr)));
    }
}


//different types of questions can be asked

/*1. next greater in the right
2. next greater in the left
3. next smallest in the right (next smaller right)
4. next smallest in the left (next smaller left)
*/

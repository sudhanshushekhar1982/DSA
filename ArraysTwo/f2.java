package ArraysTwo;
import java.util.*;
public class f2 {
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("the largest element is:"+largest);
    }
    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("the smallest element is:"+smallest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.print("enter the elements for matrix:");
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        largest(matrix);
        smallest(matrix);
    }
}

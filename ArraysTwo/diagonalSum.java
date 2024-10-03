package ArraysTwo;
import java.util.*;
public class diagonalSum {
    //brute force approach
    public static int sum(int matrix[][]) {//O(n^2)
        int sum =0 ;
        for(int i =0 ;i<matrix.length;i++) {
            for(int j =0 ;j<matrix[0].length;j++) {
                if(i == j) {
                    sum += matrix[i][j];
                } else if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    //optimal approach
    public static int diagonalSum(int matrix[][]) {//O(n)
        int sum = 0;
        for(int i =0 ;i<matrix.length;i++) {
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if(i != matrix.length-1-i) {//to minus the overlappiing condition
                sum += matrix[i][matrix.length-1-i];
            }
       }
       return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("the diagonal sum of the given matrix is:"+sum(matrix));
        System.out.println("the diagonal sum of the given matrix is:"+diagonalSum(matrix));
    }
}

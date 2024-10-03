package ArraysTwo;
import java.util.*;
public class searchInSorted {
    public static boolean search(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++) {
            for(int j =0;j<matrix[0].length;j++) {
                if(matrix[i][j] == key) {
                    System.out.println("key is found!");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static boolean staircaseSeach(int matrix[][],int key) {
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length&& col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("key found at (" + row +","+col+")");
                return true;
            } else if(key < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value iof the key:");
        int key =  sc.nextInt();
        //search(matrix, key);
        staircaseSeach(matrix, key);
    }
}

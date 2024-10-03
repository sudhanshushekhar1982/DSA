package ArraysTwo;
import java.util.*;
public class f1 {
    public static  void print(int matrix[][]) {
        for(int i = 0;i<3;i++){
            System.out.print("[");
            for(int j = 0;j<3;j++) {
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println("]");
        }
    }

    public static void input(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++) {
                System.out.print("enter the element value for: ("+i+","+j+") part :");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static boolean search(int matrix[][],int key) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++) {
               if(key == matrix[i][j]){
                System.out.println("key found!");
                return true;
               }
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
       
        input(matrix);
        System.out.println("enter the value of key:");
        
        int key = sc.nextInt();
        search(matrix,key);
    }
}

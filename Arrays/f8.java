import java.util.*;
public class f8 {
    public static void kadanes(int number[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<number.length;i++){
            currSum += number[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("our maximum subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int numbers []= {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
